package js.com.prototype;

import java.io.File;
import java.io.FileWriter;

/**
 * 原型模式，原型模式的目的是为了用clone代替new。
 * clone进行性能测试发现。clone性能不好
 *
 *
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        ConcretePrototype cp = new ConcretePrototype();
        ConcretePrototype copy;

        for(int i=0; i<10; i++){
            copy =  (ConcretePrototype)cp.clone();
            copy.getProperty();
        }


    }
}
