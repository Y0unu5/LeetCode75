package com.programs;

public class GCDofStrings {

    public static String gcdOfStrings(String str1, String str2) {
        String result = null;
        int len1 = str1.length(), len2 = str2.length();
        int maxLen = Math.min(len1, len2);

        for (int i = maxLen; i >= 1; i--) {
            if (len1 % i == 0 && len2 % i == 0 && str1.substring(0, i).equals(str2.substring(0, i))) {
                String tmp1 = str1.substring(i) + str1.substring(0, i);
                String tmp2 = str2.substring(i) + str2.substring(0, i);
                if (tmp1.equals(str1) && tmp2.equals(str2)) {
                    result = str1.substring(0, i);
                    break;
                }
            }
        }
        if (result == null) {
            result = "";
        }

        return result;
    }

    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "ABC";
        String ans= gcdOfStrings(str1,str2);
        System.out.println(ans);
    }
}