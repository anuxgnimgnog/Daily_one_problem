package everyday_ex.d20_10_23;

import java.util.Stack;

public class easy_10_23 {
    /*
     请判断一个链表是否为回文链表。
     回文链表：反转后 和 反转前 顺序一样的链表
     如： 1->2->3->2->1
     */
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(ListNode head){
        //空 和 长度为 1的 链表返回 true
        if (head != null && head.next != null) {
            //判断链表长度  偶数 则 对半拆分 奇数 则 忽略中间数对半拆分
            int len = 0;
            ListNode temp = head;
            while (temp!= null) {
                len++;
                temp = temp.next;
            }
            Stack<Integer> stack = new Stack<>();
            if (len % 2 == 0) {
                // 1 2 2 1 把 1 2 压入栈中 并让head的状态为 2 1
                for (int i = 0; i < (len / 2); i++) {
                    stack.push(head.val);
                    head = head.next;
                }
            } else {
                //1 2 3 2 1 把 1 2 压入栈中 head状态跳过3变为 2 1
                for (int i = 0; i < ((len - 1) / 2); i++) {
                    stack.push(head.val);
                    head = head.next;
                }
                head = head.next; // 跳过3
            }
            while (head != null) {
                if (stack.pop() != head.val) {
                    return false;
                }
                head = head.next;
            }
            return true;
        }
        return true;
    }
}

