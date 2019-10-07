package demo.Thread;

/**
 * Created by wangjiang on 2019/9/15.
 */
public class Demo1 {
    static class Behaver{
        private  boolean flag=true;
        StringBuffer sb=new StringBuffer("abc");
        private int count=1;
        public synchronized void printNum(){
            while(!flag){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("printNUm"+System.currentTimeMillis());
            sb.append("123");
            System.out.println(sb);

            flag=false;
            this.notify();
        }
        public synchronized void printChar(){
            while(flag){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("printChar"+System.currentTimeMillis());
            sb.delete(sb.length() - 3, sb.length());
            System.out.println(sb);
            flag = true;
            this.notify();
        }
    }

    public static void main(String[] args) {
        Behaver behaver=new Behaver();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    behaver.printNum();
                    try {
                        Thread.sleep(3000);
                        System.out.println(System.currentTimeMillis());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    behaver.printChar();
                }
            }
        }).start();
    }
}