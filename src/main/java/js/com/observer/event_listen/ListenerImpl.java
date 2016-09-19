package js.com.observer.event_listen;

/**
 * 时间监听模式
 * Created by Administrator on 2015/4/23.
 */
public class ListenerImpl implements Listener{
    @Override
    public void handEvent(Event e) {
        switch (e.getEventType()){
            case 1:
                System.out.println("event 1");
                break;
            case 2:
                System.out.println("event 2");
                break;
            case 3:
                System.out.println("event 3");
                break;
            default:
                System.out.println("unknow event");
        }
    }
}
