package js.com.facade;

/**
 * Created by Administrator on 2015/4/22.
 */
public class Facade {
    private SubSystem1 one;
    private SubSystem2 two;
    private SubSystem3 three;

    public Facade(){
        one = new SubSystem1();
        two = new SubSystem2();
        three = new SubSystem3();
    }

    public void methodA(){
        one.methodOne();
        two.methodTwo();
    }

    public void methodB(){
        two.methodTwo();
        three.methodThree();
    }

}
