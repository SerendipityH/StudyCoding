package com.serendipity.study.equals;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
    // 定义号码校验规则
    public final static String regex = "^1[0-9]\\d{9}$";
    // 定义字符校验规则
    public final static String regex2 = ".*[a-zA-Z]+.*";
    // 定义数据存放
    static Set<String> testData = new HashSet<>();

    public static void main(String[] args) {
        // TODO 通过此手机号注册成功
        String phoneNum1 = "138 1234 1234";

        // TODO 通过本手机号无法注册，提示为非法手机号
        String phoneNum2 = "13812345abc";

        // TODO 通过此手机号注册成功
        String phoneNum3 = "13812345678";

        // TODO 提示此手机号已经被其他用户注册
        String phoneNum4 = "138 1234 5678";

        // TODO 此手机号码为中国大陆非法手机号码
        String phoneNum5 = "98765432101";

        check(phoneNum1);

        check(phoneNum2);

        check(phoneNum3);

        check(phoneNum4);

        check(phoneNum5);

    }

    // 定义校验规则
    public static void check(String testNumber) {
        String phoneNum = testNumber.replaceAll("\\s*", "");
        if (phoneNum.matches(regex)) {
            boolean flag = testData.contains(phoneNum);
            if (flag) {
                System.out.println("此手机号已经被其他用户注册");
            } else {
                setData(phoneNum);
                System.out.println("通过此手机号注册成功");
            }

        } else if (phoneNum.matches(regex2)) {
            System.out.println("通过本手机号无法注册，提示为非法手机号");
        } else {
            System.out.println("此手机号码为中国大陆非法手机号码");
        }

    }

    // 存放数据
    public static void setData(String phoneNum) {
        testData.add(phoneNum);
    }
}
