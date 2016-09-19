package js.com.command;


/**
 * Created by Administrator on 2015/4/23.
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void executo();
}
