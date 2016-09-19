package js.com.chain_of_responsibility;

/**
 * Created by Administrator on 2015/4/23.
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(int request);

}
