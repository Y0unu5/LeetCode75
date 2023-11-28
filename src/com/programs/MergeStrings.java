package com.programs;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating
 * order, starting with word1. If a string is longer than the other, append the additional letters
 * onto the end of the merged string.
 * Return the merged string.
 */
public class MergeStrings {
    /**
     *
     * @param word1
     * @param word2
     * @return String of alternately
     *
     */
    public String mergeAlternately(String word1, String word2){
        StringBuilder result= new StringBuilder();
        int i=0;
        while (i < word1.length() || i < word2.length()){
            if (i < word1.length())
                result.append(word1.charAt(i));
            if (i< word2.length())
                result.append(word2.charAt(i));
            i++;
        } 
        return result.toString();
    }
    public String merge(String s1, String s2){
        int length1= s1.length();
        int length2= s2.length();

        StringBuilder sb= new StringBuilder();

        int index1=0, index2=0;
        while (index1 < length1 && index2 < length2){
            sb.append(s1.charAt(index1));
            sb.append(s2.charAt(index2));
            index1++;
            index2++;
        }
        if (index1 < length1)
            sb.append(s1.substring(index1));
        if (index2 < length2)
            sb.append(s2.substring(index2));

        return sb.toString();
    }

    public static void main(String[] args) {
        MergeStrings m= new MergeStrings();
        String w1="abc";
        String w2="pqr";
        //String ans= m.mergeAlternately(w1,w2);
        String ans= m.merge(w1, w2);
        System.out.println(ans);
    }
}
