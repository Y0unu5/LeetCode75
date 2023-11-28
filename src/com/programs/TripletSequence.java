package com.programs;

import java.util.Stack;

public class TripletSequence {
    public static boolean increasingTriplet(int[] nums){
        /**

        int n= nums.length;
        int[] left=new int[n];
        Stack<Integer> stack=new Stack<>();
        for (int i=0; i<n; i++){
            int x= nums[i];
            while (!stack.isEmpty() && stack.peek() >= x){
                stack.pop();
            }
            if (stack.isEmpty()){
                left[i]= Integer.MIN_VALUE;
            }else {
                left[i]= stack.peek();
            }
            stack.push(x);
        }
        stack.clear();

        for (int i=n-1; i>=0;i--){
            int x= nums[i];
            while (!stack.isEmpty() && stack.peek() <=x){
                stack.pop();
            }
            if (!stack.isEmpty() && left[i] != Integer.MIN_VALUE)
                return true;
            stack.push(x);
        }
        */

        int a= Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > b) return true;
            if (a > num) a = num;
            if (a < num && num < b) {
                b = num;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        boolean res=increasingTriplet(num);
        System.out.println(res);
    }
}
