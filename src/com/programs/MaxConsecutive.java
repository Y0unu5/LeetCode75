package com.programs;

public class MaxConsecutive {
    /**
     *
     * @param nums a binary array nums and an integer k,
     * @param k an integer k,
     * @return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
     */
    public int maxConsecutive(int[] nums, int k){
        int left=0, right=0, n= nums.length;
        while (right < n){
            if (nums[right++] == 0) k--;
            if (k < 0){
                if (nums[left] == 0) k++;
                left++;
            }
        }
        return right-left;
    }

    public static void main(String[] args) {
        MaxConsecutive c=new MaxConsecutive();
        int[] nums={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int ans= c.maxConsecutive(nums,k);
        System.out.println(ans);
        //ans = 6
    }
}
