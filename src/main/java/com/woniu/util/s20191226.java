package com.woniu.util;

public class s20191226 {

	public boolean canWinNim(int n) {
		return n % 4 == 0 ? false : true;
	}

	/**
	 * 557. 反转字符串中的单词 III 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
	 * 
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
		String[] sArry = s.split(" ");
		StringBuffer sbf = new StringBuffer();
		for (String str : sArry) {
			StringBuffer sb = new StringBuffer(str);
			StringBuffer re = sb.reverse();
			sbf.append(" " + re);
		}
		return sbf.toString().substring(1);
	}

}
