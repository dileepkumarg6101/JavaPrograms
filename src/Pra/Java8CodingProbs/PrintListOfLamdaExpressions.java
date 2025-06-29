package Pra.Java8CodingProbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 Print a list using  Lambda Expressions
 */
public class PrintListOfLamdaExpressions {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("dileep", "kumar", "dilkush");
        list.forEach(i -> System.out.print(i +" "));


    }
}
