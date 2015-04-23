package js.com.template_method;

/**
 * Created by Administrator on 2015/4/22.
 */
public abstract class AbstractClass {

    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        System.out.println("this is templateMethod");
        primitiveOperation2();
    }

}
