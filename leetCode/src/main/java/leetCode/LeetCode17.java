package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/26 20:10
 */
public class LeetCode17 {
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        int length=digits.length();
        if(length==0){
            return list;
        }
        Map<Character,String> map = new HashMap<Character,String>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");

        }};
        backtracking(list, map, digits, 0, new StringBuffer());
        return list;
    }
    public static void backtracking(List<String>list,Map<Character,String> map,String digits,int index,StringBuffer buffer){
        if(index == digits.length()){
            list.add(buffer.toString());
        }else{
            char digit = digits.charAt(index);
            String str = map.get(digit);
            int strLength = str.length();
            for(int i = 0;i<strLength;i++){
                buffer.append(str.charAt(i));
                backtracking(list,map,digits,index+1,buffer);
                buffer.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {

    }
}
