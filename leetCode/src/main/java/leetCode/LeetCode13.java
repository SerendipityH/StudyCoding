package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/28 21:18
 */
public class LeetCode13 {
    public static int romanToInt(String s) {
        int preNum = getValue(s.charAt(0));
        int sum = 0;
        for(int i=1;i<s.length();i++){
            int currentNum = getValue(s.charAt(i));
            if(preNum < currentNum){
                sum -= preNum;
            }else{
                sum +=preNum;
            }
            preNum = currentNum;
        }
        sum += preNum;
        return sum;
    }

    public static int getValue(char c){
        switch(c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

}
