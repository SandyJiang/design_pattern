package js.com.adapter;

/**
 * Created by Administrator on 2015/4/23.
 */
public class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
