package demo.JVM;

/**
 * Created by wangjiang on 2019/10/31.
 */
public class ReferenceCountingGc {

    public Object instance =null;

    private static  final int  _1MB=1024 * 1024;

    private byte[] bigSize=new byte[2* _1MB];


    public static void main(String[] args) {

        ReferenceCountingGc objA=new ReferenceCountingGc();
        ReferenceCountingGc objB=new ReferenceCountingGc();

        objA.instance=objB;
        objB.instance=objA;

        objA=null;
        objB=null;


        System.gc();


        }
}

