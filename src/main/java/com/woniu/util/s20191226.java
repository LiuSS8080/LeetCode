package com.woniu.util;

public class s20191226 {

    public boolean canWinNim(int n) {
        return n%4==0?false:true;
    }
    public String reverseWords(String s) {
        String[] sArry = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sArry.length; i++) {
            char[] chars = sArry[i].toCharArray();
            char temp;
            for (int j = 0; j < chars.length/2; j++) {
                temp = chars[i];
                chars[i] = chars[chars.length-1-i];
                chars[chars.length-1-i] = temp;
            }
            sb.append(sArry[i]);
        }
        return sb.toString();
    }




}
