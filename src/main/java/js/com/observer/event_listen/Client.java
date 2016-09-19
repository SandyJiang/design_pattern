package js.com.observer.event_listen;

/**
 * Created by Administrator on 2015/4/23.
 */
public class Client {
    public static void main(String[] args) {
        Listener listener = new ListenerImpl();
        Event event1 = new EventImpl(Event.event1);
        Event event2 = new EventImpl(Event.event2);
        listener.handEvent(event1);
        listener.handEvent(event2);
    }
}
