package js.com.build;

/**
 * Created by Administrator on 2015/4/22.
 */
public class ConcreteBuilder1 extends  Builder {

    private Product product = new Product();

    @Override
    public void builderPartA() {
        product.add("部件A");
    }

    @Override
    public void builderPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
