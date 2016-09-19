package js.com.observer.event_listen;

/**
 * Created by Administrator on 2015/4/23.
 */
public class EventImpl implements Event {

    private int type;

    public EventImpl(int type) {
        this.type = type;
    }

    @Override
    public int getEventType() {
        return type;
    }
}
