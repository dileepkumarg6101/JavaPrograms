package Pra.FunctionalInterface;
import java.util.function.Function;
public class FunctionalInterfaceOneArgumentReturnValue {
    public static void main(String[] args) {
        Function<String, Integer> strLength = str -> str.length();
        System.out.println(strLength.apply("chatGpt"));
    }

}
