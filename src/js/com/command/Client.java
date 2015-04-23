package js.com.command;

/**
 * 命令模式
 * Created by Administrator on 2015/4/23.
 */
public class Client {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();
        i.setCommand(c);
        i.executeCommand();
    }
}
