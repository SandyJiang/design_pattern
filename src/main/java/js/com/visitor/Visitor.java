package js.com.visitor;

/**
 * 访问者模式
 * Created by Administrator on 2015/4/23.
 */
public interface Visitor {

    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);

}
