package demo.desginmodel;

/**
 * Created by wangjiang on 2019/9/9.
 */
public class SingleObject {

    //创建 SingleObject 的一个对象，   饿汉式，线程安全
    //private static SingleObject instance = new SingleObject();

    private static SingleObject instance;


    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象 //懒汉式 线程不安全
//    public static SingleObject getInstance(){
//        return instance;
//    }

  //懒汉式 线程安全
    public static synchronized SingleObject getInstance(){
        if (instance == null) {
           instance=new SingleObject();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }


}
