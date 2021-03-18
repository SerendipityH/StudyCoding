package com.serendipity.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/28 14:07
 */
public class Java8Test {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<Integer> numbers = Arrays.asList(3, 2, 1, 6, 7, 8, 5,4,9);

        System.out.println(strings.stream().filter(string -> string.contains("a")).collect(Collectors.joining(" ")));
        /*numbers.sort(Integer::compareTo);*/
        //Collections.sort(numbers,(s1,s2)->s1.compareTo(s2));
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);
    }
}
