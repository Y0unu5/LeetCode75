package com.programs;

import java.util.Arrays;

public class MoveZero {
    public void move(int[] num){
        int sorted=0;
        for (int i=0; i< num.length; i++){
            if (num[i] != 0){
                num[sorted++] = num[i];
            }
        }
        for (int i= sorted; i < num.length; i++){
            num[i]=0;
        }
    }
    public static void main(String[] args) {
        MoveZero zero=new MoveZero();
        int[] n={0,1,0,3,12};
        zero.move(n);
        System.out.println(Arrays.toString(n));
    }
}
