package js.com.visitor;

/**
 * Created by Administrator on 2015/4/23.
 */
public interface Element {

    public abstract void accept(Visitor visitor);

}
