package js.com.prototype;

/**
 * Created by Administrator on 2015/4/22.
 */
public class Prototype implements Cloneable{

    public Prototype clone(){
        try {
            return (Prototype)super.clone();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
