package js.com.mediator;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2( Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事2收到消息 " + message);
    }

}
