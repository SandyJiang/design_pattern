package js.com.proxy;

/**
 * 静态代理
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
