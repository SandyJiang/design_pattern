package js.com.singleton;

/**
 * 单例模式 懒汉式
 * Created by Administrator on 2015/4/22.
 */
public class Lazy {
    //私有的默认构造子
    private Lazy() {

    }
    //注意，这里没有final
    private static Lazy singleton=null;
    //静态工厂方法
    public synchronized  static Lazy getInstance() {
        if (singleton == null) {
            singleton = new Lazy();
        }
        return singleton;
    }
}
