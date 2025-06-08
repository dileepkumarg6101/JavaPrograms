package Pra.FunctionalInterface;

@java.lang.FunctionalInterface
interface MyFunction {
    void execute();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        MyFunction myFunction = () -> System.out.println("Hello from functional interface!");
        myFunction.execute();
    }
}
