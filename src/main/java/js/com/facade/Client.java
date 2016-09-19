package js.com.facade;

/**
 * 外观模式
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        System.out.println("=========");
        facade.methodB();
    }
}
