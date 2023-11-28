package com.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static String reverseWords(String s){
        /**
         * List<String> words= Arrays.asList(s.trim().split("\\s+"));
         *         Collections.reverse(words);
         *         return String.join(" ", words);
         */
        String[] words= s.split(" ");
        StringBuilder result= new StringBuilder(words.length);
        for (int i= words.length -1; i>=0; i--){
            if (words[i].length() != 0){
                if (result.length() !=0){
                    result.append(" ");
                }
                result.append(words[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s= "the sky is blue";
        String ans= reverseWords(s);
        System.out.println(ans);
    }
}
