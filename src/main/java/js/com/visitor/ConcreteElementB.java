package js.com.visitor;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

}
