package demo.Thread;

import java.lang.reflect.Method;
import java.util.concurrent.*;

/**
 * Created by wangjiang on 2019/9/15.
 */

    public class CallableStread implements Callable<Integer> {

    private int number;

    public CallableStread(int number){
        this.number = number;
    }
        @Override
        public Integer call() throws Exception {
            int i = 0;
            for (; i < number; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            return i;
        }

    public static void main(String[] args) throws Exception {
//        FutureTask<Integer> ft = new FutureTask<>(new CallableStread(100));
//        new Thread(ft).start();
//        try {
//            System.out.println(ft.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        String s = "abc";
//        if(s.equals("abc")) {
//            throw new NumberFormatException();
//        } else {
//            System.out.println(s);
//        }

   Class clazz=Class.forName("demo.Thread.Demo1");
        Method[] methods=clazz.getDeclaredMethods();
        for (Method method:methods
             ) {
            System.out.println(method);
        }


//        /**创建线程池对象*/
//        ExecutorService pool = Executors.newFixedThreadPool(2);
//
//        /**可以执行Runnable对象或者Callable对象代表的线程*/
//        Future<Integer> f1 = pool.submit(new CallableStread(100));
//        Future<Integer> f2 = pool.submit(new CallableStread(200));
//
//        /**V get()*/
//        Integer i1 = f1.get();
//        Integer i2 = f2.get();
//        System.out.println(i1);
//        System.out.println(i2);
//
//        /**结束*/
//        pool.shutdown();
    }
    }


