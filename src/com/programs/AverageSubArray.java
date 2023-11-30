package com.programs;

public class AverageSubArray
{
    public static double findMaxAverage(int[] nums, int k){
        /*
         * Initialized currentSum=0
         * 1st for loop: Initially currentSum is Cal for first k elements
         * Re assigning currentSum to maxSum
         *2nd for loop: iterates the remaining elements of the array.
         * At each iteration the currentSum is updated by subtracting the value of the
         * element leaving the sliding window (element at index i-k) and adding the value of
         * the element entering the sliding window (element at index i)
         * The maxSum is updated whenever the current currentSum is greater than the current maxSum.
         */
        double currentSum=0;
        for (int i=0; i<k; i++){
            currentSum += nums[i];
        }
        double maxSum = currentSum;
        for (int i=k; i< nums.length; i++){
            currentSum +=(nums[i] - nums[i-k]);
            maxSum= Math.max(maxSum, currentSum);
        }

        return  maxSum /k;
    }

    public static void main(String[] args) {
        int[] num={1,12,-5,-6,50,3};
        int k=4;
        double res= findMaxAverage(num, k);
        System.out.println(res);
    }
}
