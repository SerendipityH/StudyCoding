package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/29 21:54
 */
public class LeetCode451 {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Character>[] bucket = new ArrayList[s.length()+1];

        map.forEach((key,value)->{
            if (bucket[value] == null) {
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
        });

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = bucket.length-1 ; i > 0;i--){
            if(bucket[i] == null){
                continue;
            }
            for(char c:bucket[i]){
                for(int j = 0 ;j<i;j++){
                    stringBuilder.append(c);
                }
            }

        }
        return  stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}
