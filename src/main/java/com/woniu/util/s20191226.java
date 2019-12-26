package com.woniu.util;

public class s20191226 {

    public boolean canWinNim(int n) {
        return n%4==0?false:true;
    }
    /**557. 反转字符串中的单词 III
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     * @param s
     * @return
     */
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
