package demo;


import demo.desginmodel.Singletten;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by wangjiang on 2019/9/15.
 */
public class Test {

    public int hash;


    public static void main(String[] args) throws ParseException, IOException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

        long startTime = System.currentTimeMillis();
        ArrayList arrayList=new ArrayList();
        for (int i=0;i<1000000;i++){
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间
        LinkedList linkedList=new LinkedList();
        for (int i=0;i<1000000;i++){
           linkedList.add(i);
        }
        long endTime2 = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间：" + (endTime2 -endTime) + "ms"); //输出程序运行时间

       // Collections.binarySearch()



        List<String> list =  new ArrayList<>(Arrays.asList("王利虎","张三","李四"));
        list.add("1212121");
        try {
            list.add("sasa");
        }
        catch (Exception e){
            System.out.println("error");
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        String str="abc";

        System.out.println(str.hashCode());


        String str1="a"+new String("bc");
        System.out.println(str==str1);

       //枚举的单例模式
        Singletten singletten=Singletten.INSTANCE;

        singletten.test();

        File file=new File("src/demo/test.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        try {
            //FileInputStream fileInputStream=new FileInputStream(file);
            byte[]array = new byte[15360];
            //4.循环往外流(count为每次读取数组中的有效字节总数)
            int count = fileInputStream.read(array);
            // 5.循环打印
            while (count != -1) {
                // 将byte[] -》 String
                // 将byte数组读取到的有效字节转换成字符串
                String st = new String(array, 0, count);
                System.out.print(st);
                count = fileInputStream.read(array);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            fileInputStream.close();
        }


        }


}
