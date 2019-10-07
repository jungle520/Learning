package demo.AbstractFactory;

/**
 * Created by wangjiang on 2019/9/22.
 */
public class FactoryProducer  {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Brand")){
            return new BrandFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
