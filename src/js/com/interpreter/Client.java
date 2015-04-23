package js.com.interpreter;

import java.util.List;
import java.util.ArrayList;

/**
 * 解释其模式
 * Created by Administrator on 2015/4/23.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for(int i=0; i<list.size(); i++){
            list.get(i).interpret(context);
        }

    }
}
