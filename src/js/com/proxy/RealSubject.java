package js.com.proxy;

/**
 * Created by Administrator on 2015/4/22.
 */
public class RealSubject implements Subject {
    public void request(){
        System.out.println("Real subject invoked!");
    }
}
