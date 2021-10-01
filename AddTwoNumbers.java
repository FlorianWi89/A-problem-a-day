public class AddTwoNumbers {

    // You are given two non-empty linked lists representing two non-negative
    // integers.
    // The digits are stored in reverse order, and each of their nodes contains a
    // single digit.
    // Add the two numbers and return the sum as a linked list.
    // You may assume the two numbers do not contain any leading zero, except the
    // number 0 itself.

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        // O(N) Time since both lists are only watched once
        public ListNode addTwoNums(ListNode l1, ListNode l2) {
            ListNode start = new ListNode(0); // initialize new List start
            ListNode dummy = start;

            int sum = 0; // track the sum
            while (l1 != null || l2 != null) {
                sum /= 10;
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }
                dummy.next = new ListNode(sum % 10);
                dummy = dummy.next;
            }
            if (sum / 10 == 1)
                dummy.next = new ListNode(1);
            return start.next;
        }
    }

}
