package js.com.factory.simple_factory;

/**
 * 简单工厂模式
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) {
        IProduct p1 = Factory.getProduct(1);
        IProduct p2 = Factory.getProduct(2);
        p1.getProperty();
        p2.getProperty();
    }
}
