package demo.Thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wangjiang on 2019/9/24.
 */
public class ProdcuterandCounsumer {

   private final static  int limit =5;




    static class Producer implements  Runnable{
        List list=new ArrayList();
        @Override
        public void run() {
            synchronized (list){
                while(list.size()== 5){

                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
