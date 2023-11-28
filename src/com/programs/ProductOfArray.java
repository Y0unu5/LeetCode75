package com.programs;

import java.util.Arrays;

public class ProductOfArray {
    public static int[] productExceptSelf(int[] nums){
        int n= nums.length;
        int i, temp=1;
        int[] prod= new int[n];

        for (int j=0; j< n; j++)
            prod[j]=1;
        for (i=0; i< n; i++){
            prod[i]= temp;
            temp *= nums[i];
        }

        temp=1;
        for (i=n-1; i>=0; i--){
            prod[i] *= temp;
            temp *= nums[i];
        }
        for (i=0; i<n; i++)
            System.out.print(prod[i]+ " ");

        return prod;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        productExceptSelf(nums);
        //System.out.println(Arrays.toString(res));
    }
}
