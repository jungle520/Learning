package demo.Thread;

import java.util.concurrent.Semaphore;

/**
 * Created by wangjiang on 2019/9/22.
 */
public class SemphoreTest {

    public static void main(String[] args) {
        int N=8;
        Semaphore semaphore=new Semaphore(5);

        for(int i=1;i<=N;i++){
            new Worker(i,semaphore).start();
        }
    }

    static class Worker extends Thread{
        private int  num;
        private Semaphore semaphore;

        public Worker(int num,Semaphore semaphore){
            this.num=num;
            this.semaphore=semaphore;
        }

        public  void run() {
            try {
semaphore.acquire();
                System.out.println("工人"+this.num+"占用一个机器在生产...");
                sleep(2000);
                System.out.println("工人"+this.num+"释放出机器");
                semaphore.release();
            }

catch(Exception e){
    e.printStackTrace();
}
        }
    }
}
