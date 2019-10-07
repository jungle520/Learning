package demo.AbstractFactory;

/**
 * Created by wangjiang on 2019/9/22.
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory brandFactory=FactoryProducer.getFactory("Brand");
        CarBrand carBrand=brandFactory.getCar("Benz");
        carBrand.setBrand();
    }
}
