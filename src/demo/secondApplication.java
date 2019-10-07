package demo;

import java.io.File;
import java.nio.file.Files;
import java.util.*;

/**
 * Created by wangjiang on 2019/9/2.
 * 类型转换
 */
public class secondApplication {

    public static void main(String args[]) {
        //Short myshort=99S;
        //float z=1.0;
//        int t="abc".length();
//        char c='都';
//        int [] a=new int[]{1,2,3};
//        System.out.println(a.length);
        /*八种基本类型 byte -128~127
         short
         char
         int
         long
         float
         double
         前三种为低级类型，可以自动转换为后面的高级类型，高级类型转为低级类型需要qiang
         */
        byte b = 1;
        int i = b;


        int a = 5;
        System.out.println("value is " + ((a < 5) ? 10.9 : 9));

        char x = 'x';
        System.out.println(false ? i : x);


        ArrayList arrayList = new ArrayList();
        arrayList.add("123");
        arrayList.add("456");

        System.out.println(Collections.max(arrayList)+"111");
        Iterator<String> it = arrayList.iterator();


        while (it.hasNext()) {
            System.out.println(it.next());
        }
        ListIterator<String> lit = arrayList.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        System.out.println(Math.round(1.5));
        System.out.println(Math.random()*100);



    }
}
