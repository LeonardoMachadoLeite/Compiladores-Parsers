package CompilerBase.LR;

import CompilerBase.AbstractToken;

public abstract class AbsSemantic {

    public abstract void Execute(int rule, AbstractToken token);
}