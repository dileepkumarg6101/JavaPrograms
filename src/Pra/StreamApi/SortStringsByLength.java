package Pra.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*
Sort the list of given strings in increasing order of their length

 */
public class SortStringsByLength {
    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("zzzz");
        stringList.add("g");
        stringList.add("bb");
        stringList.add("ccc");

        stringList.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(i -> System.out.print(i +" "));

    }
}
