package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/28 22:01
 */
public class LeetCode347 {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        map.forEach((key, value) -> {
            if (bucket[value] == null) {
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
        });
        List<Integer> topK = new ArrayList<>();
        int[] arr = new int[k];
        for (int i = bucket.length - 1; i >= 0 && topK.size() < k; i--) {
            if (bucket[i] != null) {
                topK.addAll(bucket[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            arr[i] = topK.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{4, 4, 4, 3, 2, 2, 1}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{2, 1}, 2)));
    }

}
