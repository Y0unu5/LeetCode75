package com.programs;

public class EqualRowAndColumn {
    public int equalPairs(int[][] grid){
        /*
              {3,1,2,2},
              {1,4,4,5},
              {2,4,2,2},
              {2,4,2,2}
         */
        int n= grid.length;
        int ans=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                int ok=1;
                for (int k=0; k<n; k++){
                    if (grid[i][k] != grid[k][j]){
                        ok=0;
                        break;
                    }
                }
                ans += ok;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        EqualRowAndColumn equal=new EqualRowAndColumn();
        int[][] grid={
                {3,1,2,2},
                {1,4,4,5},
                {2,4,2,2},
                {2,4,2,2}
        };
        int nas= equal.equalPairs(grid);
        System.out.println(nas);


    }
}
