package js.com.state;

/**
 * Created by Administrator on 2015/4/23.
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.println(state.getClass().getSimpleName());
        this.state = state;
    }

    public void request(){
        state.handle(this);
    }
}
