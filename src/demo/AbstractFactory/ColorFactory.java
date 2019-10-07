package demo.AbstractFactory;

/**
 * Created by wangjiang on 2019/9/22.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public CarBrand getCar(String carName) {
        return null;
    }

    @Override
    public CarColor getColor(String color) {

        if(color.equalsIgnoreCase("Yellow")){
            return  new Yellow();
        }
        else if (color.equalsIgnoreCase("Red")){
            return new Red();
        }
        return null;
    }
}
