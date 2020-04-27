package CompilerBase.LR;

import CompilerBase.AbstractToken;

public abstract class AbsScanner {

    public abstract AbstractToken nextToken(String text);
}