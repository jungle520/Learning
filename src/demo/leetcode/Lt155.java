package demo.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wangjiang on 2019/10/4.
 */
public class Lt155 {
    List list=new ArrayList<>();//定义栈存储结构


    public Lt155() {

    }

    public void push(int x) {
        list.add((Integer) x);
    }

    public void pop() {
      if(list==null){

      }
        list.remove(list.size()-1);
    }

    public int top() {
        if(list==null){
           return Integer.parseInt(null);
        }
       return (int)list.get(list.size()-1);
    }

    public int getMin() {
        if(list==null){
            return Integer.parseInt(null);
        }
     return (Integer) Collections.min(list);
    }
}
