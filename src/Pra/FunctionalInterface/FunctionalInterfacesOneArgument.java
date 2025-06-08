package Pra.FunctionalInterface;
import java.util.function.Predicate;
public class FunctionalInterfacesOneArgument {
    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.isEmpty();
        System.out.println(predicate.test("")); // true
        System.out.println(predicate.test("Hello")); // false

    }
}
