package js.com.bridge;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteImplementorA implements  Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
