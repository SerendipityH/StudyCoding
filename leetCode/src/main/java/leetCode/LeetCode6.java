package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/20 16:17
 */
public class LeetCode6 {
    public static String convert(String s, int numRows) {
        if(numRows<=1){
            return s;
        }
        List<StringBuilder> list = new ArrayList<StringBuilder>();
        for(int i =0;i<numRows;i++){
            list.add(new StringBuilder());
        }
        int index = 0;
        int flag = -1;
        for(char str:s.toCharArray()){
            list.get(index).append(str);
            if(index == 0 || index == numRows-1){
                flag = -flag;
            }
            index+=flag;
        }
        StringBuilder ret = new StringBuilder();
        for(StringBuilder sb :list){
            ret.append(sb);
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAHNAPLSIIGYIR",3));
    }
}
