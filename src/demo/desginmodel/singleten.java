package demo.desginmodel;

/**
 * Created by wangjiang on 2019/9/9.
 */
public class singleten {
    /*
    创建型模式（5种）：工厂方法模式，抽象工厂模式，单例模式，建造者模式，原型模式。
    结构型模式（7种）：适配器模式，装饰器模式，代理模式，外观模式，桥接模式，组合模式，享元模式。
     行为型模式（11种）：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。
     设计模式遵循的原则有6个：
1、开闭原则（Open Close Principle）

　　对扩展开放，对修改关闭。

2、里氏代换原则（Liskov Substitution Principle）

　　只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。

3、依赖倒转原则（Dependence Inversion Principle）

　　这个是开闭原则的基础，对接口编程，依赖于抽象而不依赖于具体。

4、接口隔离原则（Interface Segregation Principle）

　　使用多个隔离的借口来降低耦合度。

5、迪米特法则（最少知道原则）（Demeter Principle）

　　一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。

6、合成复用原则（Composite Reuse Principle）

　　原则是尽量使用合成/聚合的方式，而不是使用继承。继承实际上破坏了类的封装性，超类的方法可能会被子类修改。

     */



    //单例模式 懒汉式 非线程安全，在需要的时候才实例化；
//    private static singleten instance;
//
//    private singleten(){
//
//    }
//    public  static singleten getInstance(){
//        if (null==instance){
//            instance=new singleten();
//        }
//        return instance;
//    }
    //单例模式 懒汉式 通过synchronized实现线程安全，在需要的时候才实例化；
//    private static singleten instance;
//
//    private singleten(){
//
//    }
//    public  static synchronized  singleten getInstance(){
//        if (null==instance){
//            instance=new singleten();
//        }
//        return instance;
//    }
    //单例模式 饿汉式

//    private  static  singleten instance=new singleten();
//
//    private singleten(){}
//
//
//    public static singleten getInstance(){
//        return instance;
//    }
//
    //双重锁模式
//    private static volatile  singleten instance;
//
//    private singleten(){
//
//    }
//
//    public  static  singleten getInstance(){
//        synchronized (singleten.class) {
//   if (instance==null){
//    instance=new singleten();
//   }
//    return instance;
//        }
//
//    }
    //静态类登记模式
    private  singleten(){
    }

    private static class SingInstacne{
        public static singleten Instance=new singleten();
    }

    public static singleten getinstance(){
        return  SingInstacne.Instance;
    }




}
