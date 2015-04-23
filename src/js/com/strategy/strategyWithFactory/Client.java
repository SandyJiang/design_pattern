package js.com.strategy.strategyWithFactory;

/**
 * 策略模式与工厂模式的集成
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) {
        Context c = new Context();
        c.contextInterface(1);
        c.contextInterface(2);
        c.contextInterface(3);
    }
}
