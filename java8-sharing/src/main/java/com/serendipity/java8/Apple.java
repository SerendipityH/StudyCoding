package com.serendipity.java8;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/24 19:59
 */
public class Apple {
    private String color;

    private Integer weight;

    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
