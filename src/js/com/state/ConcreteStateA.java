package js.com.state;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteStateA implements  State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
