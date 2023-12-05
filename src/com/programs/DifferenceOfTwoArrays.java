package com.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2){

        Set<Integer> s1= convert(nums1);
        Set<Integer> s2= convert(nums2);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list1=  new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        for(int num2: s2){
            if (!s1.contains(num2))
                list1.add(num2);
        }
        for (int num1 : s1){
            if (!s2.contains(num1))
                list2.add(num1);
        }

        ans.add(list2);
        ans.add(list1);

        return ans;
    }

    private Set<Integer> convert(int[] nums1) {
        Set<Integer> set= new HashSet<>();
        for (int num: nums1){
            set.add(num);
        }
        return set;
    }

    public static void main(String[] args) {

        DifferenceOfTwoArrays diff= new DifferenceOfTwoArrays();
        int[] nums1 = {1,2,3}, nums2 = {2,4,6};
        List<List<Integer>> result= diff.findDifference(nums1, nums2);
        System.out.println(result);
    }
}
