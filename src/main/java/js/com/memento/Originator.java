package js.com.memento;

/**
 * Created by Administrator on 2015/4/23.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        this.state = memento.getState();
    }

    public void show(){
        System.out.println(state);
    }
}
