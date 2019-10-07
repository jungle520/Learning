package demo.AbstractFactory;

/**
 * Created by wangjiang on 2019/9/22.
 */
public class Red implements CarColor {
    @Override
    public void setColor() {
        System.out.println("car color is red");
    }
}
