package js.com.command;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void executo() {
        receiver.action();
    }
}
