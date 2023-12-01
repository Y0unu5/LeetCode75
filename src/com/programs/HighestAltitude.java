package com.programs;

public class HighestAltitude {
    public static int highestAltitudes(int[] gain){

        int max=0, sum=0;
        for (int altitude: gain){
            /*
             This line adds the current element altitude to the sum variable, effectively calculating
             the cumulative gain up to the current element.
             */
            sum += altitude;
            /*
                This line compares the current sum value with the current max value and updates the max
                variable if the sum value is greater. This ensures that max always holds the maximum
                cumulative gain found so far
             */
            max= Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        int ans= highestAltitudes(gain);
        System.out.println(ans);
    }
}
