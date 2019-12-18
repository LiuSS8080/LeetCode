package com.woniu.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (m.containsKey(nums[i])) {
				nums[0] = m.get(target - nums[i]);
				nums[1] = i;
			}
			m.put(target - nums[i], i);
		}

		return arr;

	}
	public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        int x = 0;
        int y = 0;
		for (int i = 1; i < points.length; i++) {
			//x = points[i][0]<points[i-1][0]?points[i-1][0]-points[i][0]:points[i][0]-points[i-1][0];
			x=Math.abs(points[i-1][0]-points[i][0]);
			//y = points[i][1]<points[i-1][1]?points[i-1][1]-points[i][1]:points[i][1]-points[i-1][1];
			y=Math.abs(points[i-1][1]-points[i][1]);
        	time += x > y?x:y;
		}
		return time;
    }
	/**
	 * 有 n 位用户参加活动，他们的 ID 从 0 到 n - 1，
	 * 每位用户都 恰好 属于某一用户组。给你一个长度为 n 的数组 groupSizes，
	 * 其中包含每位用户所处的用户组的大小，请你返回用户分组情况（存在的用户组以及每个组中用户的 ID）。
	 */
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Integer group = 0;
        list.get(group).add(0);
        Map<Integer,Integer[]> map = new HashMap<Integer,Integer[]>();
		for (int i = 1; i < groupSizes.length; i++) {
			for (int j = 0; j < i-1; j++) {
				if(groupSizes[j]==groupSizes[i] && list.get(group).size()>groupSizes[i]) {
					
					list.get(group).add(i);
					break;
				}else {
					group++;
					list.get(group).add(i);
				}
			}
		}
		return list;
    }
	/**
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     */
    public int firstUniqChar(String s) {
        
    	char[] cs = s.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(int i = 0;i < cs.length;i++){
            if (map.containsKey(cs[i])) {
                map.put(cs[i], map.get(cs[i])+1);
            } else {
                map.put(cs[i], 1);
            }
        }
		for (int j = 0; j < cs.length; j++) {
			if(map.get(cs[j])==1) {
				return j;
			}
		}
		return -1;
    }
    /**
     * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
     */
    

}
