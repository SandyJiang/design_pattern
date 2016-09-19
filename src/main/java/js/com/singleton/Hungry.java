package js.com.singleton;

/**
 * 单例模式 饿汉式
 * Created by Administrator on 2015/4/22.
 */
public class Hungry {
    //私有的默认构造子
    private Hungry() {

    }
    //已经自行实例化
    private static final Hungry singleton = new Hungry();
    //静态工厂方法
    public static Hungry getInstance() {
        return singleton;
    }
}
