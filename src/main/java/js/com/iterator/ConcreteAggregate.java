package js.com.iterator;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> items = new ArrayList<Object>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return items.size();
    }

    public Object getItem(int index){
        return items.get(index);
    }

    public void addItem(int index, Object o){
        items.add(index,o);
    }
    public void addItem(Object o){
        items.add(o);
    }
}
