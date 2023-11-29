package com.programs;

public class LongestOnes {
    public int longestOnes(int[] nums){

        int n= nums.length-1;
        int l=0;
        int count=0;

        for (int num : nums){
            /*
              This if statement checks if the current element num is equal to 0.
              If the current element num is 0, the count variable is incremented by 1.
              This indicates that another zero has been encountered within the current window.
             */
            if (num ==0)
                ++count;
            /*
              This if statement checks two conditions:
              count > 1: This checks if more than one zero has been encountered within the current window.
              nums[l++] == 0: This checks if the element at index l (the leftmost index of the current window)
              is also equal to 0.

              If both conditions are true, it means that the current window has exceeded the allowable number of
              zeros (1), and the leftmost zero (at index l) needs to be removed from the window.
              If the conditions are met, the count variable is decremented by 1. This removes the zero at
              index l from the current window's count of zeros.
             */
            if (count > 1 && nums[l++] ==0)
                --count;
        }

        return n-l;
    }

    public static void main(String[] args) {
        LongestOnes one=new LongestOnes();
        int[] num={0,1,1,1,0,1,1,0,1};
        int res=one.longestOnes(num);
        System.out.println(res);
    }
}
