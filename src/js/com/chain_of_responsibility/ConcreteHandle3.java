package js.com.chain_of_responsibility;

/**
 * Created by Administrator on 2015/4/23.
 */
public class ConcreteHandle3 extends Handler{
    @Override
    public void handleRequest(int request) {
        if(request >= 20 && request < 30){
            System.out.println(this.getClass().getSimpleName() + " handle " + request);
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
