package js.com.factory.abstract_factory;

/**
 * Created by Administrator on 2015/4/22.
 */
public class Factory implements IFactory {

    @Override
    public IProduct getProductA() {
        return new ProductA();
    }

    @Override
    public IProduct getProductB() {
        return new ProductB();
    }
}
