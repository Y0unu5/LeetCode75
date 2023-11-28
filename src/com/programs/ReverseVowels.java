package com.programs;

import java.util.HashSet;

public class ReverseVowels {
   public String reverseVowels(String s){
       char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
       char[] chars= s.toCharArray();
       int left=0, right= chars.length-1;

       while (left < right){
           while (left < right && !isVowel(chars[left], vowels)){
               left++;
           }
           while (left < right && !isVowel(chars[right], vowels)){
               right--;
           }

           char temp= chars[left];
           chars[left]=chars[right];
           chars[right]=temp;

           left++;
           right--;
       }
        return new String(chars);
   }

   public static boolean isVowel(char c, char[] vowels){
       for (char vowel: vowels){
           if (c == vowel){
               return true;
           }
       }
       return false;
   }
    public static void main(String[] args) {
        ReverseVowels vowels= new ReverseVowels();
        String s = "leetcode";
        String ans= vowels.reverseVowels(s);
        System.out.println(ans);
    }
}
