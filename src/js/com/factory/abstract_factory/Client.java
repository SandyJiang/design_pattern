package js.com.factory.abstract_factory;

/**
 * 抽象工厂模式
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct p1 = factory.getProductA();
        IProduct p2 = factory.getProductB();
        p1.getProperty();
        p2.getProperty();
    }
}
