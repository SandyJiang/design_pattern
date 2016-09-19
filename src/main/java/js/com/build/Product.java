package js.com.build;

import java.util.*;

/**
 * Created by Administrator on 2015/4/22.
 */
public class Product {
    List<String> parts = new ArrayList();
    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("产品创建");
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }
}
