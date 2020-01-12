package com.woniu.util;

public class s20200112 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }
    }

    /**237. 删除链表中的节点
     * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，
     * 你将只被给定要求被删除的节点。
     * 现有一个链表 --?head =?[4,5,1,9]，它可以表示为:
     * 输入: head = [4,5,1,9], node = 5
     * 输出: [4,1,9]
     * @param node
     */
    public void deleteNode(ListNode node) {
        //将删除节点的下一个节点值赋给删除节点
        node.val = node.next.val;
        //将当前节点值的next指向下下一个节点（相当于删除下个节点,前提为当前节点不是最后一个节点）
        node.next = node.next.next;
    }
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

    /**104. 二叉树的最大深度
     * 给定一个二叉树，找出其最大深度。
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     * 说明: 叶子节点是指没有子节点的节点。
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            TreeNode leftNode = root.left;
            TreeNode rightNode = root.right;
            return Math.max(maxDepth(leftNode),maxDepth(rightNode))+1;
        }
    }
}
