package com.woniu.test;

import java.util.List;

import org.junit.Test;

import com.woniu.util.Solution;
import com.woniu.util.s20191226;

public class SoluTest {

	@Test
	public void test() {
		Solution s = new Solution();
		int[] twoSum = s.twoSum(new int[]{2,6,9,3}, 9);
	}
	@Test
	public void test1() {
		Solution s = new Solution();
		int[][] arr = new int[2][];
		arr[0]=new int[] {3,2};
		arr[1]=new int[] {-2,2};
		int points = s.minTimeToVisitAllPoints(arr);
		System.out.println(points);
	}
	
	@Test
	public void test2() {
		Solution s = new Solution();
		int[] arr = new int[] {2,1,3,3,3,2};
		List<List<Integer>> groupThePeople = s.groupThePeople(arr);
		for (List<Integer> list : groupThePeople) {
			System.out.println(list);
		}
	}
	@Test
	public void test3() {
		Solution s = new Solution();
		int i = s.firstUniqChar("aadadaad");
		System.out.println(i);
	}
	@Test
	public void test4() {
		Solution s = new Solution();
//		String string = s.defangIPaddr("255.100.50.0");
//		System.out.println(string);
	}
	@Test
	public void test5() {
		s20191226 s = new s20191226();
		s.reverseWords("Let's take LeetCode contest");
	}

}
