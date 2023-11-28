package com.programs;

public class StringCompression {
    public int compress(char[] chars){
        int ans=0;
        for (int i=0; i < chars.length;){
            char letter= chars[i];
            int count=0;
            while (i < chars.length && chars[i]== letter){
                ++count;
                ++i;
            }
            chars[ans++]= letter;
            if (count > 1)
                for (char c: String.valueOf(count).toCharArray())
                    chars[ans++]= c;
        }
        return ans;
    }

    public static void main(String[] args) {
        StringCompression compression= new StringCompression();
        char[] in={'a','a','b','b','c','c','d','d'};
        int ans= compression.compress(in);
        System.out.println(ans);
    }
}
