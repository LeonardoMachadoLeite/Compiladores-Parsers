package CompilerBase.LL;

import java.util.*;

import CompilerBase.*;

public abstract class AbsSemantic {

    public abstract void Execute(AbsTag action, Stack<AbsTag> stk, AbstractToken token);
}
