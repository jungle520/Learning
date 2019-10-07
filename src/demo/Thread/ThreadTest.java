package demo.Thread;

/**
 * Created by wangjiang on 2019/9/14.
 */
public class ThreadTest  extends Thread{
    //定义标志位和被修改的字符串
      static  volatile  boolean fl=true;
    StringBuffer sb=new StringBuffer("abc");


    @Override
    public void run() {

      test(sb);

    }


    public static void main(String[] args) {
        ThreadTest th=new ThreadTest();
        ThreadTest th2=new ThreadTest();
        for(int i=1;i<21;i++) {
            new Thread(th).start();
            System.out.println(Thread.currentThread().getName()+"  : "+i);

        }
        System.out.println("执行完毕");
    }

    public  static  synchronized  void test(StringBuffer sb){
        if (fl) {
            sb.append("123");
            System.out.println(sb);
        }
        if (!fl) {
            sb.delete(sb.length() - 3, sb.length());
            System.out.println(sb);
        }
    }
}
