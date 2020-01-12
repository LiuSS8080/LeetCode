package com.woniu.util;

public class s20200112 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }
    }

    /**237. ɾ�������еĽڵ�
     * ���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬
     * �㽫ֻ������Ҫ��ɾ���Ľڵ㡣
     * ����һ������ --?head =?[4,5,1,9]�������Ա�ʾΪ:
     * ����: head = [4,5,1,9], node = 5
     * ���: [4,1,9]
     * @param node
     */
    public void deleteNode(ListNode node) {
        //��ɾ���ڵ����һ���ڵ�ֵ����ɾ���ڵ�
        node.val = node.next.val;
        //����ǰ�ڵ�ֵ��nextָ������һ���ڵ㣨�൱��ɾ���¸��ڵ�,ǰ��Ϊ��ǰ�ڵ㲻�����һ���ڵ㣩
        node.next = node.next.next;
    }
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

    /**104. ��������������
     * ����һ�����������ҳ��������ȡ�
     * �����������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����
     * ˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
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
