package com.woniu.util;

public class S20200113 {
    /**344. 反转字符串
     *编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
     * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
     * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
     * @param s
     */
    public void reverseString(char[] s) {
        for(int i = 0;i < s.length/2;i++){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }

    /**
     * 反转一个单链表。
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode currNode = head;
        ListNode nextNode = null;
        while (currNode!=null){
            nextNode = currNode.next;
            currNode.next = pre;
            pre = currNode;
            currNode = nextNode;
        }
        return pre;
    }
}
