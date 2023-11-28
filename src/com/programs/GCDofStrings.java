package com.programs;

public class GCDofStrings {
    public String gcdOfString(String str1, String str2){
        if (str1.length() < str2.length())
            return gcdOfString(str2,str1);
        if (!str1.startsWith(str2))
            return "";
        if (str2.isEmpty())
            return str1;
        return gcdOfString(str2, mod(str1,str2));
    }
    public String gcdOfStrings(String a, String b) {
        if(!(a + b).equals(b + a))return "";

        int gcd = gcd(a.length(), b.length());

        return a.substring(0, gcd);
    }

    int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b, a%b);
    }
    private String mod(String st1, String st2){
        while (st1.startsWith(st2))
            st1= st1.substring(st2.length());
        return st1;
    }

    public static void main(String[] args) {
        String s= "ABCABC", str2 = "ABC";
        GCDofStrings gdc=new GCDofStrings();
        String ans=gdc.gcdOfStrings(s, str2);
        System.out.println(ans);
    }
}