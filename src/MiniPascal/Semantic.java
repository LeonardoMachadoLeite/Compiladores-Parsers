package MiniPascal;

import java.util.Stack;

import CompilerBase.*;
import CompilerBase.LL.*;

public class Semantic extends AbsSemantic {

    @Override
    public void Execute(AbsTag action, Stack<AbsTag> stk, AbstractToken token) {

        int tos = stk.size() - 1;

        if (action.equals(Tag._Echo)) {
            // stk.peek().SetAttribute(0, action.GetAttribute(0));
        }
    }
}