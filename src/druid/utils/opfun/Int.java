package druid.utils.opfun;

import java.util.function.IntBinaryOperator;

public final class Int {
    private Int() {
    }

    public static final IntBinaryOperator add = (a, b) -> a + b;
    public static final IntBinaryOperator subtract = (a, b) -> a
            - b;
    public static final IntBinaryOperator multiply = (a, b) -> a
            * b;
    public static final IntBinaryOperator divide = (a, b) -> a
            / b;
}
