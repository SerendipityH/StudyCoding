package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/23 22:20
 */
public class LeetCode12 {
    public String intToRoman(int num) {
        int value[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String romanValues[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder str = new StringBuilder();
        for(int i =0;i<value.length;i++){
            while(num>=value[i]){
                num-=value[i];
                str.append(romanValues[i]);
            }
        }
        return str.toString();
    }
}
