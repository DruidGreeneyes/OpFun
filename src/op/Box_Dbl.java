package op;

import java.util.function.ToDoubleBiFunction;

public final class Box_Dbl {
    public Box_Dbl() {
    }

    public static final ToDoubleBiFunction<Double, Double> add = (a, b) -> a
            + b;
    public static final ToDoubleBiFunction<Double, Double> subtract = (a,
            b) -> a
            - b;
    public static final ToDoubleBiFunction<Double, Double> d_multiply = (a,
            b) -> a * b;
    public static final ToDoubleBiFunction<Double, Double> divide = (a, b) -> a
            / b;

}
