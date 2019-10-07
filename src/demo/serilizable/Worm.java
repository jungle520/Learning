package demo.serilizable;

import java.io.*;
import java.util.Random;

/**
 * Created by wangjiang on 2019/9/21.
 */
public class Worm implements Serializable {
    public static void main(String[] args)
            throws ClassNotFoundException, IOException {   //   序列话读入和写入Object可能会有这两个异常
        //   将你要序列化的object，保留到一个文件中
        Random rand = new Random();
        Data d = new Data(rand.nextInt(10));   //构建你需要序列话的Object
        System.out.println("d   =   " + d);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("worm.out"));   //   准备写入的文件
        out.writeObject(d);
        out.flush();
        out.close();   //   执行到这里你可以看见worm.out这个文件，
        //   以下的代码读出你刚刚写入Object
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("worm.out"));   // 读你刚刚写入的文件
        Data d2 = (Data) in.readObject();   // 重新构建你刚刚写入的Object
        System.out.println("d2   =   " + d2);
    }
}

