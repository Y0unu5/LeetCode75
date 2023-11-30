package com.programs;

public class MostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = Integer.MIN_VALUE;
        while (l < r) {
            int min = Math.min(height[l], height[r]);
            max = Math.max(max, min * (r - l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }

    public int max(int[] height) {
        int n = height.length;
        int left = height[0], right = height[n - 1];
        int max = Math.min(left, right) * (n - 1);
        int i = 0, j = n - 1;
        while (i < j) {
            if (left < right) {
                while (i < j && height[i] <= left) {
                    i++;
                }
                if (i == j) break;
                left = height[i];
                max = Math.max(max, (Math.min(left, right) * (j - i)));
            } else {
                while (i < j && height[j] <= right) {
                    j--;
                }
                if (i == j) break;
                right = height[j];
                max = Math.max(max, Math.min(left, right) * (j - i));
            }
        }
        return max;
    }

    public int maxArea1(int[] height) {
        int l = 0, r = height.length - 1, max = Integer.MIN_VALUE;
        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            int currentArea = (r - l) * minHeight;
            max = Math.max(max, currentArea);

            if (height[l] < height[r]) {
                while (l < r && height[l] <= minHeight) l++;
            } else {
                while (l < r && height[r] <= minHeight) r--;
            }
        }

        return max;
    }
        public static void main (String[]args){
            int[] hieghts = {1, 8, 6, 2, 5, 4, 8, 3, 7};
            MostWater water = new MostWater();
            int max = water.maxArea1(hieghts);
            int m = water.max(hieghts);
            System.out.println(max);
        }
    }
