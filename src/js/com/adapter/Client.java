package js.com.adapter;

/**
 * 适配器模式
 * Created by Administrator on 2015/4/23.
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
