package js.com.fly_weight;

/**
 * 享元模式
 * Created by Administrator on 2015/4/23.
 */
public class Client {

    public static void main(String[] args) {
        int extrinsicState = 23;
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight fx = factory.getFlyWeight("X");
        fx.operation(--extrinsicState);

        FlyWeight fy = factory.getFlyWeight("X");
        fy.operation(--extrinsicState);

        FlyWeight fz = factory.getFlyWeight("X");
        fz.operation(--extrinsicState);

        UnSharedFlyWeight uf =new  UnSharedFlyWeight();
        uf.operation(--extrinsicState);
    }
}
