package com.woniu.util;

public class s20191226 {

	public boolean canWinNim(int n) {
		return n % 4 == 0 ? false : true;
	}

	/**
	 * 557. ��ת�ַ����еĵ��� III ����һ���ַ���������Ҫ��ת�ַ�����ÿ�����ʵ��ַ�˳��ͬʱ�Ա����ո�͵��ʵĳ�ʼ˳��
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
