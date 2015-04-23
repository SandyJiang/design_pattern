package js.com.chain_of_responsibility;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteHandle1 extends Handler {

    @Override
    public void handleRequest(int request) {
        if(request >= 0 && request < 10){
            System.out.println(this.getClass().getSimpleName() + " handle " + request);
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
