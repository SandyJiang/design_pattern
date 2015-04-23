package js.com.decorator;

/**
 * 装饰模式,看看JDK的BIO库就知道，
 * 对于API的调用者而言，装饰模式并不好用
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA da = new ConcreteDecoratorA(c);
        ConcreteDecoratorB db = new ConcreteDecoratorB(da);
        db.opration();
    }
}
