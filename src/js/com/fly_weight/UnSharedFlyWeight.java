package js.com.fly_weight;

/**
 * Created by Administrator on 2015/4/23.
 */
public class UnSharedFlyWeight implements FlyWeight  {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体flyweight: " + extrinsicState);
    }
}
