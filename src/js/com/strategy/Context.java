package js.com.strategy;

/**
 * Created by Administrator on 2015/4/22.
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy =  strategy;
    }

    public void contextInterface(){
        strategy.algorithm();
    }
}
