package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/30 9:51
 */
public class LeetCode118 {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> solutList = new ArrayList<List<Integer>>();
        for(int i= 0;i< numRows;i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0;j<=i;j++){
                if(j == 0 || j == i){
                    list.add(1);
                }else {
                    list.add(j,solutList.get(i-1).get(j-1)+solutList.get(i-1).get(j));
                }
            }
                solutList.add(list);
        }
        return solutList;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
