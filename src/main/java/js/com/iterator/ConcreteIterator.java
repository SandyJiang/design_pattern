package js.com.iterator;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteIterator implements Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItem(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if(current < aggregate.count()){
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.count()?true:false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItem(current);
    }
}
