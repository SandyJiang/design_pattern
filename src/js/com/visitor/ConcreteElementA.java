package js.com.visitor;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
