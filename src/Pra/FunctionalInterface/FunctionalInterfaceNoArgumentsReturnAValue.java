package Pra.FunctionalInterface;
import java.util.function.Supplier;
public class FunctionalInterfaceNoArgumentsReturnAValue {
    public static void main(String[] args) {
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get()); // prints a random number
    }
}
