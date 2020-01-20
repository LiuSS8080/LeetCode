package com.woniu.util;

import java.util.Arrays;

public class s20200120 {
    /**169. 多数元素
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/majority-element
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        //排序算法
        /*
        Arrays.sort(nums);
        return nums[nums.length/2];
        */
        //投票算法
        int count = 0;
        int result = nums[0];
        for (int num:nums){
            if(count==0){
                result=num;
            }
            count = num==result?count+1:count-1;
        }
        return result;

    }

    /**21. 合并两个有序链表
     *将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 （按照大小顺序）
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode prev = head;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1==null?l2:l1;
        return head.next;
    }
}
