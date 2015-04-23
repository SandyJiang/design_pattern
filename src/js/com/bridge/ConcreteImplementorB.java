package js.com.bridge;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现B的方法执行");
    }
}
