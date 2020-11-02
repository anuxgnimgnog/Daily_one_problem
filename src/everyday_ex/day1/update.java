package everyday_ex.day1;

import java.util.Stack;

public class update {
    public boolean isPalindrome(ListNode head){
        ListNode node = head;
        Stack<ListNode> stack = new Stack<>();
        while(node != null){
            stack.push(node);
            node = node.next;
        }
        while(!stack.isEmpty()){
            if (stack.pop().val != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
