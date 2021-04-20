package leetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/20 21:21
 */
public class LeetCode844 {

    public static boolean backspaceCompare(String s, String t) {

        StringBuffer sbuffer = new StringBuffer();
        StringBuffer tbuffer = new StringBuffer();
        for(int i= 0;i<s.length();i++){
            if(s.charAt(i)=='#' && sbuffer.length()>0){
                sbuffer.deleteCharAt(sbuffer.length()-1);
            }else if(s.charAt(i)!='#'){
                sbuffer.append(s.charAt(i));
            }
        }
        for(int i= 0;i<t.length();i++){
            if(t.charAt(i)=='#' && tbuffer.length()>0){
                tbuffer.deleteCharAt(tbuffer.length()-1);
            }else if(t.charAt(i)!='#'){
                tbuffer.append(t.charAt(i));
            }
        }
        if(sbuffer.toString().equals(tbuffer.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f","y#f#o##f"));


    }
}
