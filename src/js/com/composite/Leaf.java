package js.com.composite;

/**
 * Created by Administrator on 2015/4/23.
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Can not add");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Can not remove");
    }

    @Override
    public void display(int depth) {
        for(int i=0; i<depth; i++){
            System.out.print("-");
        }
        System.out.print(name);
        System.out.println("");
    }
}
