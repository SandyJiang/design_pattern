package js.com.proxy;

/**
 * Created by Administrator on 2015/4/22.
 */
public class Proxy implements Subject{
    private Subject subject;
    public Proxy(Subject subject){
        this.subject = subject;
    }

    public void request(){
        System.out.println("Proxy start invoked!");
        subject.request();
        System.out.println("Proxy end invoked!");
    }

}
