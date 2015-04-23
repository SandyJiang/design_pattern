package js.com.chain_of_responsibility;

/**
 * 责任链模式
 * Created by Administrator on 2015/4/23.
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandle1();
        Handler h2 = new ConcreteHandle2();
        Handler h3 = new ConcreteHandle3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = new int[]{2, 5, 12, 7, 28, 23, 18, 11};

        for(int i=0; i<requests.length; i++){
            h1.handleRequest(requests[i]);
        }

    }
}

