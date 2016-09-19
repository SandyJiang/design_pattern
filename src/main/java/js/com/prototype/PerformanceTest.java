package js.com.prototype;

/**
 * 性能测试，使用原型模式创建对象很慢的。不如直接new
 * Created by Administrator on 2015/4/22.
 */
public class PerformanceTest {
    public static void main(String[] args) throws Exception {
        ConcretePrototype cp = new ConcretePrototype();
        ConcretePrototype copy;

        long begin = 0;
        long end = 0;
        //原型模式测试
        begin = System.currentTimeMillis();
        for(int i=0; i<99999999; i++){
            copy =  (ConcretePrototype)cp.clone();
        }
        end = System.currentTimeMillis();

        System.out.println(end -begin);

        //直接new测试
        begin = System.currentTimeMillis();
        for(int i=0; i<99999999; i++){
            copy =  new ConcretePrototype();
        }
        end = System.currentTimeMillis();
        System.out.println(end -begin);

    }
}
