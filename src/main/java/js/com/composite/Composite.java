package js.com.composite;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Administrator on 2015/4/23.
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        for(int i=0; i<depth; i++){
            System.out.print("-");
        }
        System.out.print(name);
        System.out.println("");
        for(int i=0; i<children.size(); i++){
            children.get(i).display(depth + 2);
        }
    }
}
