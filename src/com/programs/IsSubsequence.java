package com.programs;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t){
        boolean b= true;
        int len= s.length();
        if (len > 0){
            int i= t.indexOf(s.charAt(0));
            if (i != -1)
                return isSubsequence(s.substring(1), t.substring(++i));
            else
                return false;
        }
        return b;
    }

    public static void main(String[] args) {
        IsSubsequence subsequence= new IsSubsequence();
        String s= "axc", t="ahbgdc";
        boolean ans;
        ans = subsequence.isSubsequence(s, t);
        System.out.println(ans);
    }
}
