package com.programs;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int n= nums.length;
        int sum=0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum=0;
        int i=0;
        while (i<n) {
            if (leftSum == sum -leftSum- nums[i]){
                return i;
            }
            leftSum += nums[i];
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num={1,7,3,6,5,6};
        int res= pivotIndex(num);
        System.out.println(res);
    }
}
