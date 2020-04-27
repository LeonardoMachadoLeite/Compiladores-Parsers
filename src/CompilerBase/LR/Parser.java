package CompilerBase.LR;

import java.util.*; 

import CompilerBase.*;

public class Parser {

    private final Control _control;
    private final AbsScanner _scanner;
    private final AbsSemantic _semantic;

    public Parser(final Control control, final AbsScanner scanner, final AbsSemantic semantic) {
        _control = control;
        _scanner = scanner;
        _semantic = semantic;
    }

    public boolean Parse(final String text) {

        Stack<Integer> stk = new Stack<Integer>();

        // Configuração inicial
        String txt = text + "#";
        stk.push(0); // Estado inicial
        AbstractToken current = _scanner.nextToken(txt);
        AbstractToken previous = null;

        System.out.println(current);

        while(true)
        {
            if (_control.isShift(stk.peek(), current.toTag())) {

                int target = _control.toInt(stk.peek(), current.toTag());

                stk.push(target);

                previous = current;

                current = _scanner.nextToken(txt);
                System.out.println(current);
            }
            else if (_control.isReduce(stk.peek(), current.toTag())) {

                int prod = _control.toInt(stk.peek(), current.toTag());

                AbsTag lhs = _control.getLHS(prod);
                int size = _control.getSize(prod);

                for (int i = 0; i < size; i++) {
                    stk.pop();
                }

                stk.push(_control.toInt(stk.peek(), lhs));

                // System.out.println("Redução " + prod);
                _semantic.Execute(prod, previous);
            }
            else if (_control.isAccept(stk.peek(), current.toTag())) {

                // Simulação da redução 0
                _semantic.Execute(0, previous);

                return true;
            }
            else {
                return false;
            }
        }
    }
}