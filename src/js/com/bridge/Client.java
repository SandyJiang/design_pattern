package js.com.bridge;

/**
 * 桥接模式
 * Created by Administrator on 2015/4/23.
 */
public class Client {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
