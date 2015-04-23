package js.com.iterator;

/**
 * 迭代器模式
 * Created by Administrator on 2015/4/23.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.addItem("大鸟");
        a.addItem("大鸟");
        a.addItem("小A");
        a.addItem("大B");
        Iterator i = new ConcreteIterator(a);
        Object item = i.first();
        System.out.println(item);
        System.out.println("-------迭代测试开始---------");
        while(!i.isDone()){
            System.out.println(i.currentItem());
            i.next();
        }
    }
}
