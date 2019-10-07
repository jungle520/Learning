package demo;

import java.math.BigDecimal;

/**
 * Created by wangjiang on 2019/9/2.
 */
public class firstApplication {

    static {
        int x=5;
    }
    static int x,y;

    public static  final  int ENDNUMBER=Integer.MAX_VALUE;
    public static  final  int STARTNUMBER=ENDNUMBER-2;
    public static void main(String[] args){
        System.out.println("jungle");

        // TODO Auto-generated method stub
        //i++和++i
        x--;
        System.out.println(x);
        method();
        System.out.println(x);
        System.out.println(x+ y++ +x);

        //字符串截取
        String s="111222333";
        String s1=s.substring(4, s.length()-1);
        System.out.println(s1);

        //Intege赋值问题
        Integer total=0;
        changeInteger(total);
        System.out.println(total);

        Float totalMoney=200000.8f;
        Float ownMoney=170000.5F;
        Float leftMoney=totalMoney-ownMoney;
        System.out.println(leftMoney);

        BigDecimal b1=new BigDecimal(Float.toString(totalMoney));
        BigDecimal b2=new BigDecimal(Float.toString(ownMoney));
        Float b3=b1.subtract(b2).floatValue();
        System.out.println(b3);

        System.out.println(result());
        int count=0;
        System.out.println(ENDNUMBER);



    }

    public static  void changeInteger(Integer total){
        if (total<1){
            total=total.intValue()+1;
        }

    }

    public static void method(){
        System.out.println(x);
        y=x++ + ++x;
        System.out.println(y);
    }


    @SuppressWarnings("finally")
    public  static  boolean result(){
        try{
            return  true;
        }catch (Exception e){
            return true;
        }
        finally {
            return  false;
        }
    }



}
