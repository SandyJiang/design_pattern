package js.com.fly_weight;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteFlyWeight implements FlyWeight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体flyweight: " + extrinsicState);
    }
}
