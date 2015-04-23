package js.com.template_method;

/**
 * Created by Administrator on 2015/4/22.
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("before template method");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("after template method");
    }
}
