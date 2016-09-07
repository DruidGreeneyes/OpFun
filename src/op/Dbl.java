package op;

import java.util.function.DoubleBinaryOperator;

public final class Dbl {
    private Dbl() {
    }

    public static final DoubleBinaryOperator add = (a, b) -> a + b;
    public static final DoubleBinaryOperator subtract = (a, b) -> a - b;
    public static final DoubleBinaryOperator multiply = (a, b) -> a * b;
    public static final DoubleBinaryOperator divide = (a, b) -> a / b;
}
