package js.com.state;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
