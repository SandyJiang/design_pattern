package js.com.fly_weight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/4/23.
 */
public class FlyWeightFactory {

    private Map flyWeights = new HashMap();

    public FlyWeightFactory(){
        flyWeights.put("X", new ConcreteFlyWeight());
        flyWeights.put("Y", new ConcreteFlyWeight());
        flyWeights.put("Z", new ConcreteFlyWeight());
    }

    public FlyWeight getFlyWeight(String key){
        return (FlyWeight)flyWeights.get(key);
    }
}
