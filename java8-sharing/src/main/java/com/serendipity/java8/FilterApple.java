package com.serendipity.java8;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/24 19:59
 */
public class FilterApple {
    public static List<Apple> findGreenApple(List<Apple> apples){
        List<Apple> list = new ArrayList<Apple>();

        for (Apple apple:apples){
            if("green".equals(apple.getColor())){
                list.add(apple);
            }
        }
        return list;
    }
    public static List<Apple> findApple(List<Apple> apples ,String color){
        List<Apple> list = new ArrayList<Apple>();

        for (Apple apple:apples){
            if(color.equals(apple.getColor())){
                list.add(apple);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green",150),new Apple("yellow",120),new Apple("green",170));
       /* List<Apple> greenApple = findGreenApple(list);
        //assert greenApple.size() == 2;
        List<Apple> green = findApple(list, "green");
        System.out.println(green);

        List<Apple> red = findApple(list, "yellow");
        System.out.println(red);*/

        list.sort((a1, a2) -> a2.getWeight().compareTo(a1.getWeight()));
        System.out.println(list);
        String str = "abc";
        Optional<String> str1 = Optional.of(str);
        System.out.println(str1.get());

    }
}
