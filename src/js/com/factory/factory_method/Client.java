package js.com.factory.factory_method;

/**
 * 工厂方法模式
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factoryA = new FactoryA();
        IFactory factoryB = new FactoryA();
        IProduct p1 = factoryA.getProduct();
        IProduct p2 = factoryB.getProduct();
        p1.getProperty();
        p2.getProperty();
    }
}
