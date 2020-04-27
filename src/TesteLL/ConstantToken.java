package TesteLL;

public class ConstantToken extends Token {

    private double _value;

    public ConstantToken(double value) { 
        super(Tag.CTE); 

        _value = value;
    }

    public double getValue() {
        return _value;
    }

    @Override
    public String toString() {
        return "<" + toTag().toString() + ", "+ _value + ">";
    }
}
