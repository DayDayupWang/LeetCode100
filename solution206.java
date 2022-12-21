
import java.util.Deque;
import java.util.Stack;

public class solution206 {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // while (head != null) {
        // System.out.println(head.val);
        // head = head.next;
        // }
        ListNode result = reverseList(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        Stack<Integer> s1 = new Stack<Integer>();
        ListNode l1 = new ListNode(0);
        ListNode res = l1;
        while (head != null) {
            s1.push(head.val);
            head = head.next;
        }

        while (!s1.empty()) {

            l1.next = new ListNode(s1.pop());
            l1 = l1.next;
        }
        return res.next;
    }
}
