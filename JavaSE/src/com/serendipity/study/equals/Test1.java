package com.serendipity.study.equals;

public class Test1 {


    public static void main(String[] args) {
        // TODO 输出最长对称字符串：goog
        String input1 = "google";

        // TODO 输出最长对称字符串：aba
        String input2 = "abcda";

        // TODO 输出2个最长对称字符串：pop/upu
        String input3 = "pop-upu";

        System.out.println(input1 + " 输出最长对称字符串: " + findLCS(input1)); 
        System.out.println(input2 + " 输出最长对称字符串:  " + findLCS(input2)); 
        System.out.println(input3 + " 输出最长对称字符串:  " + findLCS(input3)); 
    }


    private static String findLCS(String input) {
        // 要返回的结果
        StringBuilder result = new StringBuilder();

        // 将字符串反转
        String reverse = new StringBuilder(input).reverse().toString();

        // 字符串长度
        int len = input.length();

        // 矩阵 -> 二维数组
        int[][] temp = new int[len][len];

        // 横向字符
        char[] hor = input.toCharArray();

        // 纵向字符
        char[] ver = reverse.toCharArray();

        // 给矩阵(二维数组赋值)
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                temp[i][j] = (hor[j] == ver[i]) ? 1 : 0;
            }
        }

        // 找到第一个横向
        int horIndex = -1;
        for (int i = 0; i < len - 1; i++) {
            if (temp[0][i] == 1) {
                horIndex = i;
            }
        }

        // 找到第一个纵向
        int verIndex = -1;
        for (int i = 0; i < len - 1; i++) {
            if (temp[i][0] == 1) {
                verIndex = i;
            }
        }

        // 处理特殊情况的标识，如 abcda
        boolean flag = false;

        int indexHor = 0;
        if (horIndex != -1 && horIndex != 0) {
            for (int i = horIndex; i < len; i++) {
                if (temp[indexHor++][i] == 1) {
                    result.append(hor[i]);
                }
            }
            flag = true;
        }

        int indexVer = verIndex;
        if (verIndex != -1) {
            if (flag) {
                result.append("/");
            }
            for (int i = 0; i < len - verIndex; i++) {
                if (temp[indexVer++][i] == 1) {
                    result.append(hor[i]);
                }
            }
        }

        return result.toString();
    }
 }