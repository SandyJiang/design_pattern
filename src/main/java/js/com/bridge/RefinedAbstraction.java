package js.com.bridge;

/**
 * Created by Administrator on 2015/4/23.
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
