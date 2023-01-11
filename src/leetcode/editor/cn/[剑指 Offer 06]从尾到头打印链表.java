package leetcode.editor.cn;//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
//
// Related Topics 栈 递归 链表 双指针 👍 361 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SolutionOffer06 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int[] reversePrint(ListNode head) {
        int length =0;
        ListNode node = head;
        while(node != null){
            length ++;
            node = node.next;
        }
        int []res = new int[length];
        readList(head,res,length-1);
        return res;
    }

    private void readList(ListNode node,int [] res ,int index){
        if(node == null)
            return;
        readList(node.next,res,index-1);
        res[index] = node.val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
