package js.com.visitor;

/**
 * 访问者模式
 * Created by Administrator on 2015/4/23.
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitorA v1 = new ConcreteVisitorA();
        ConcreteVisitorB v2 = new ConcreteVisitorB();

        o.accept(v1);
        o.accept(v2);
    }
}
