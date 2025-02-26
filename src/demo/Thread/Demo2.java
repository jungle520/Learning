package demo.Thread;

/**
 * Created by wangjiang on 2019/9/15.
 */
public class Demo2 {
    static class Mywork {
        private volatile boolean flag=true;//代表是否等待
        private synchronized void sub(){
            while (! flag){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 2; i++) {
                System.out.println("sub run "+ i);
            }
            flag=false;
            this.notify();
        }
        private synchronized void mainRun(){
            while (flag){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 2; i++) {
                System.out.println("main run----------- "+i);
            }
            flag=true;
            this.notify();
        }
    }
    public static void main(String[] args) {
        Mywork mywork=new Mywork();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    mywork.sub();
                }
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            mywork.mainRun();
        }
    }
}
