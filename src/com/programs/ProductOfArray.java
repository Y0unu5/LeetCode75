package com.programs;

import java.util.Arrays;

public class ProductOfArray {

    public static int[] productExceptSelf(int[] arr){
        int n= arr.length;
        int[] prod= new int[n];

        for (int i=0; i< n; i++){
            prod[i]=1;
        }

        // Calculate product from left to right
        int temp=1;
        for (int i=0; i< n; i++){
            prod[i] *= temp;
            temp *= arr[i];
        }
        temp = 1;
        for (int i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }

        for (int i=0; i<n; i++){
            System.out.print(prod[i]+ " ");
        }

        return prod;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        productExceptSelf(nums);
        //System.out.println(Arrays.toString(res));
    }
}
