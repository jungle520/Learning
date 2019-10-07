package demo.Thread;

import demo.Thread.CallableStread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by wangjiang on 2019/9/15.
 */
public class ThreadDemo {
        public static void main(String[] args) {
            CallableStread ctt = new CallableStread(100);
            FutureTask<Integer> ft = new FutureTask<>(ctt);
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " 的循环变量i的值" + i);
                if (i == 20) {
                    new Thread(ft, "有返回值的线程").start();
                }
            }
            try {
                System.out.println("子线程的返回值：" + ft.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

