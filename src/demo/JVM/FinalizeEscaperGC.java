package demo.JVM;

/**
 * Created by wangjiang on 2019/9/19.
 */
public class FinalizeEscaperGC {

    public  static  FinalizeEscaperGC SAVE_HOOK= null;

    public void isAlive(){
        System.out.println("yes, i am  still alive");
    }

    @Override
    protected  void  finalize()throws  Throwable{
        super.finalize();
        System.out.println("finalize method excuted");
        FinalizeEscaperGC.SAVE_HOOK=this;
        System.out.println(this);
    }

    public static void main(String[] args) throws Throwable {
        SAVE_HOOK =new FinalizeEscaperGC();

        //对象设置为null
        SAVE_HOOK=null;
        System.gc();
        //
        Thread.sleep(500);

        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else
        {
            System.out.println("it  is dead");
        }

    }
}
