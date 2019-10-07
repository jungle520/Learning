package demo.AbstractFactory;

/**
 * Created by wangjiang on 2019/9/22.
 */
public class BrandFactory extends AbstractFactory {

    @Override
    public CarBrand getCar(String carName) {
        if(carName.equalsIgnoreCase("Benz")){
            return new Benz();
        }else if (carName.equalsIgnoreCase("Baoma")){
            return new BaoMa();
        }
        return null;
    }

    @Override
    public CarColor getColor(String color) {
        return null;
    }
}