package js.com.factory.simple_factory;

/**
 * Created by Administrator on 2015/4/22.
 */
public class Factory {
    public static IProduct getProduct(int type){
        if(type == 1){
            return new ProductA();
        }else if(type == 2){
            return new ProductB();
        }else{
            System.out.println("Sorry we don't product it");
            return null;
        }
    }
}
