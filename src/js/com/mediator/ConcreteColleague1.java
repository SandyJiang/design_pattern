package js.com.mediator;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1( Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事1收到消息 " + message);
    }

}
