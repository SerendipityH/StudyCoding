package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/11 20:57
 */
public class LeetCode14 {

    public static String longestCommonPrefix(String[] strs) {
        if(strs==null){
            return "";
        }
        StringBuilder sb = new StringBuilder(strs[0]);


        for (int j = 1;j<strs.length;j++){
            while (!strs[j].startsWith(sb.toString())){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
