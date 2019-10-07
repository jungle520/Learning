package demo;

/**
 * Created by wangjiang on 2019/9/16.
 */
public class Triangle {


    public static void main(String[] args) {
        //定义三个边长啊a,b,c； ab为直角边长
        outTriangle(6);
    }


    public static void outTriangle(int a) {

        //a为直角三角形的底边
        for (int i = 1; i <= a; i++) {
            System.out.print("*");  //打印第一行的*
            for (int j = 1; j <= i - 1; j++) {  //打印每一行的空格

                if (i == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i > 1) {
                System.out.println("*");
            } else {
                System.out.println("");
            }

        }
    }
}

