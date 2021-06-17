package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/17 21:29
 */
public class LeetCode412 {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 1;i<=n;i++){
            if(i%3==0){
                if(i%5==0){
                    list.add("FizzBuzz");
                }else{
                    list.add("Fizz");
                }
            }
            else if(i%5==0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
    }
}
