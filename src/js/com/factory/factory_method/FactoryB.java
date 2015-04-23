package js.com.factory.factory_method;

/**
 * Created by Administrator on 2015/4/22.
 */
public class FactoryB implements IFactory {

    @Override
    public IProduct getProduct() {
        return new ProductB();
    }
}
