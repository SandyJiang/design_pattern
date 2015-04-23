package js.com.template_method;

/**
 * 模板方法模式
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass clazz = new ConcreteClass();
        clazz.templateMethod();
    }
}
