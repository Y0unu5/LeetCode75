package com.programs;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        if (n == 0)
            return true;
        int count=0;
        for (int i=0; i< flowerbed.length; i++){
            if (flowerbed[i]== 0){
                int prev= (i == 0 || flowerbed[i -1] ==0) ? 0 : 1;
                int next= (i == flowerbed.length-1 || flowerbed[i + 1] == 0)?0:1;

                if (prev == 0 && next == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[] f= {0,0,1,0,0};
        int n=2;
        CanPlaceFlowers b= new CanPlaceFlowers();
        boolean ans=b.canPlaceFlowers(f,n);
        System.out.println(ans);
    }
}
