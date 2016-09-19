package js.com.interpreter;

/**
 * Created by Administrator on 2015/4/23.
 */
public class TerminalExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }

}
