package demo;

import java.util.Scanner;

/**
 * Created by wangjiang on 2019/10/3.
 */
public class YABO {

        public static void main(String[] args) {
            double numA,numB,numC,numD;
            System.out.print("请输入第一个数：");
            numA = new Scanner(System.in).nextDouble();
            System.out.print("请输入第二个数：");
            numB = new Scanner(System.in).nextDouble();
            System.out.print("请输入第三个数：");
            numC = new Scanner(System.in).nextDouble();
            System.out.print("请输入第四个数：");
            numD = new Scanner(System.in).nextDouble();
            while (numB == 0) {
                System.out.println("第二个操作数不能为0!\n");
                System.out.print("请输入第二个数：");
                numB = new Scanner(System.in).nextDouble();
            }

            System.out.println("第一家赢多少："+(numC*numA-numD*numB));
            System.out.println("第二家赢多少："+(numD*numB-numC*numA));
        }
}
