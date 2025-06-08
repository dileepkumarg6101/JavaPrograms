package Pra.FunctionalInterface;
import java.util.function.Consumer;
public class FunctionalInterfaceOneArgumentReturnNothing {
    public static void main(String[] args) {
        Consumer<String> print = message -> System.out.println(message);
        print.accept("accept message");

    }
}
