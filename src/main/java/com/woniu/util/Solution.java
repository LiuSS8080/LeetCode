package com.woniu.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	/**0001
	 * 1、两数之和 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
	 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 给定 nums = [2, 7, 11, 15], target = 9
	 * 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}

	public int[] twoSum2(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				result[0] = map.get(new Integer(1));
				result[1] = map.get(1);
				break;
			}
			map.put(target - nums[i], i);

		}
		return result;
	}

	/**0002
	 * 2、反转字符串 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
	 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用O(1) 的额外空间解决这一问题。 你可以假设数组中的所有字符都是 ASCII
	 * 码表中的可打印字符。
	 */
	public void reverseString(char[] s) {
		Character temp = null;
		for (int i = 0; i < s.length / 2; i++) {
			temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
	}

	/**0003
	 * 3、访问所有点的最小时间 平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi,
	 * yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。 你可以按照下面的规则在平面上移动：
	 * 每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。 必须按照数组中出现的顺序来访问这些点。
	 * 
	 * @param points
	 * @return
	 */
	public int minTimeToVisitAllPoints(int[][] points) {
		int time = 0;
		int x = 0;
		int y = 0;
		for (int i = 1; i < points.length; i++) {
			// x =
			// points[i][0]<points[i-1][0]?points[i-1][0]-points[i][0]:points[i][0]-points[i-1][0];
			x = Math.abs(points[i - 1][0] - points[i][0]);
			// y =
			// points[i][1]<points[i-1][1]?points[i-1][1]-points[i][1]:points[i][1]-points[i-1][1];
			y = Math.abs(points[i - 1][1] - points[i][1]);
			time += x > y ? x : y;
		}
		return time;
	}

	/**0004
	 * 4、给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
	 */
	public int firstUniqChar(String s) {

		char[] cs = s.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < cs.length; i++) {
			if (map.containsKey(cs[i])) {
				map.put(cs[i], map.get(cs[i]) + 1);
			} else {
				map.put(cs[i], 1);
			}
		}
		for (int j = 0; j < cs.length; j++) {
			if (map.get(cs[j]) == 1) {
				return j;
			}
		}
		return -1;
	}

	/**0005
	 * 5、5291. 统计位数为偶数的数字 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
	 * 
	 * @param nums
	 * @return
	 */
	public int findNumbers(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int len = String.valueOf(nums[i]).length();
			if (len % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	/**0006
	 * LCP 1. 猜数字 
	 * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3中选择一个猜。
	 * 他们一共进行三次这个游戏，请返回 小A 猜对了几次？ 
	 * 输入的guess数组为 小A 每次的猜测，
	 * answer数组为 小B每次的选择。g
	 * uess和answer的长度都等于3。
	 * @param guess
	 * @param answer
	 * @return
	 */
	public int game(int[] guess, int[] answer) {
		int count = 0;
		for (int i = 0; i < answer.length; i++) {
			if(guess[i] == answer[i]) {
				count++;
			}
		}
		return count;
	}
	
	/**0007
	 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
	 *S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
	 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
	 */
	public int numJewelsInStones(String J, String S) {
		char[] SArray = S.toCharArray();
		int count = 0;
		for (int i = 0; i < SArray.length; i++) {
			if(J.indexOf(String.valueOf(SArray[i]))!=-1) {
				count++;
			}
		}
		return count;
    }

	// =================分割线============================================================================
	public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
//	public int getDecimalValue(ListNode head) {
//        
//    }
	

	/**
	 * 
	 * 有 n 位用户参加活动，他们的 ID 从 0 到 n - 1， 每位用户都 恰好 属于某一用户组。给你一个长度为 n 的数组 groupSizes，
	 * 其中包含每位用户所处的用户组的大小，请你返回用户分组情况（存在的用户组以及每个组中用户的 ID）。
	 */
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Integer group = 0;
		list.get(group).add(0);
		Map<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
		for (int i = 1; i < groupSizes.length; i++) {
			for (int j = 0; j < i - 1; j++) {
				if (groupSizes[j] == groupSizes[i] && list.get(group).size() > groupSizes[i]) {

					list.get(group).add(i);
					break;
				} else {
					group++;
					list.get(group).add(i);
				}
			}
		}
		return list;
	}
	/**
	 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
	 */

}
