package com.programs;

public class MaximumVowels {
    public int maxVowels(String s, int k){
        int count=0;
        for (int i=0; i< k; i++){
            if(isVowel(s.charAt(i))){
                ++count;
            }
        }
        int ans= count;
        for (int i=k; i< s.length(); i++){
            if (isVowel(s.charAt(i)))
                ++count;
            if(isVowel(s.charAt(i-k)))
                --count;
            ans= Math.max(ans, count);
        }
        return ans;
    }

    private boolean isVowel(char c) {
        return c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c== 'U';
    }

    public static void main(String[] args) {
        MaximumVowels vowels= new MaximumVowels();
        String s="abciiidef";
        int k=3;
      int ans=  vowels.maxVowels(s, k);
        System.out.println(ans);
    }
}
