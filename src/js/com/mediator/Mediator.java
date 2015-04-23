package js.com.mediator;

/**
 * Created by Administrator on 2015/4/23.
 */
public interface Mediator {
    public void send(String message, Colleague colleague);
}
