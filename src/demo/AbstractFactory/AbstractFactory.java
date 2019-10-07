package demo.AbstractFactory;

/**
 * Created by wangjiang on 2019/9/22.
 */
public abstract class AbstractFactory {
    public abstract CarBrand getCar(String carName);

    public abstract CarColor getColor(String color);
}
