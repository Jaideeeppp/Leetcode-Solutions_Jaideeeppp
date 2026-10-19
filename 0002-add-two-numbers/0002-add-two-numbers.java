class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while (l1 != null) {
            s1.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.append(l2.val);
            l2 = l2.next;
        }

        s1.reverse();
        s2.reverse();

        java.math.BigInteger n1 = new java.math.BigInteger(s1.toString());
        java.math.BigInteger n2 = new java.math.BigInteger(s2.toString());

        StringBuilder res = new StringBuilder(n1.add(n2).toString());
        res.reverse();

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int i = 0; i < res.length(); i++) {
            current.next = new ListNode(res.charAt(i) - '0');
            current = current.next;
        }

        return dummy.next;
    }
}