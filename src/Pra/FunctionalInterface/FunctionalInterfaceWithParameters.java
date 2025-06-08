package Pra.FunctionalInterface;
@java.lang.FunctionalInterface
interface Calculator {
    int add(int a, int b);

}

public class FunctionalInterfaceWithParameters {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        System.out.println(calculator.add(10, 20));

    }


}
