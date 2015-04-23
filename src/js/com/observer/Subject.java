package js.com.observer;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Administrator on 2015/4/23.
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public  void attach(Observer o){
        observers.add(o);
    }

    public void  detach(Observer o){
        observers.remove(o);
    }

    public void notifyOb(){
        System.out.println("notify Invoked");
        for (int i=0; i<observers.size(); i++){
            observers.get(i).update();
        }
    }
}
