package com.woniu.util;

import java.util.HashSet;
import java.util.Set;

public class s20200121 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA!=pB){
            pA = pA==null?headB:pA.next;
            pB = pB==null?headA:pB.next;
        }
        return pA;
    }

    /**
     * 给定一个整数数组，判断是否存在重复元素。
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<Integer>();
//        for (int num : nums){
//            set.add(num);
//        }
//        return set.size()==nums.length?false:true;
        for (int i = 0;i < nums.length;i++){
            for (int j = i+1;j < nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
