package js.com.memento;

/**
 * 备忘录模式
 * Created by Administrator on 2015/4/23.
 */
public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("on");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("off");
        o.show();

        o.setMemento(c.getMemento());
        o.show();
    }
}
