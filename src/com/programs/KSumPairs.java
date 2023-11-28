package com.programs;

import java.util.HashMap;

public class KSumPairs {
    public int maxOperations(int[] nums, int k) {
        int ans=0;
        HashMap<Integer, Integer> count= new HashMap<>();
        for (int num : nums){
            count.merge(num, 1, Integer::sum);
        }
        for (int num: count.keySet()){
            int s= k- num;
            if (count.containsKey(s))
                ans += Math.min(count.get(num), count.get(s));
        }
        return ans/2;
    }

    public static void main(String[] args) {
        KSumPairs pairs= new KSumPairs();
        int[] a={1,2,3,4};
        int k=5;
        int ans= pairs.maxOperations(a,k);
        System.out.println(ans);
    }
}
