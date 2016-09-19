package js.com.iterator;

/**
 * Created by Administrator on 2015/4/23.
 */
public interface Iterator {
    public Object first();
    public Object next();
    public boolean isDone();
    public Object currentItem();
}
