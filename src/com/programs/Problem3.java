package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents
 * the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies
 * that you have.
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the
 * extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 * Note that multiple kids can have the greatest number of candies.
 */
public class Problem3 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int n= candies.length;
        List<Boolean> list= new ArrayList<>(n);
        for (int candy : candies) {
            int total = candy + extraCandies;
            int max_candies = Arrays.stream(candies).max().getAsInt();
            if (total >= max_candies) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    public List<Boolean> kidsWithCandies1ms(int[] a, int e) {
        int max=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];

        }
        ArrayList<Boolean>al=new ArrayList<>();
        for(int i:a)
        {
            if(i+e>=max)
                al.add(true);
            else
                al.add(false);
        }
        return al;


    }

    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extra=3;
        Problem3 problem3= new Problem3();
        List<Boolean> list= problem3.kidsWithCandies1ms(candies,extra);
        System.out.println(list);
    }
}
