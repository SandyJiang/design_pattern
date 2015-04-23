package js.com.build;

/**
 * 创建模式，和工厂模式不同是这货用来创建复杂模型
 * 具体的Builder引用了Product，再让Director指挥builder去执行builder的创建方法。
 * 然后再自行返回Product
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.construct(b1);;
        Product p1 = b1.getResult();
        p1.show();

        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
