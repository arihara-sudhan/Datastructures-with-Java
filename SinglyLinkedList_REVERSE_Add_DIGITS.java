/*
ARIHARASUDHAN - LEETCODE CHALLENGE
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

/*
ARIHARASUDHAN - LEETCODE CHALLENGE
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1,head2 = l2,next1=null,prev1=null,next2=null,prev2=null;
        int num1=0,num2 = 0;
        while(head1!=null) {
            next1 = head1.next;
            next2 = head2.next;
            head1.next = prev1;
            head2.next = prev2;
            prev1 = head1;
            prev2 = head2;
            head1 = next1;
            head2 = next2;
        }
        ListNode cur1 = prev1;
        ListNode cur2 = prev2;
        while(cur1!=null) {
            num1 = num1*10 + cur1.val;
            num2 = num2*10 + cur2.val;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        num1 = num1+num2;
        ListNode NEW = null,head=null;
        int i = 0;
        while(num1!=0){
            NEW = new ListNode(num1%10);
            if(i==0){
                head = NEW;
                i++;
            }
            num1/=10;
            NEW = NEW.next;
        }
        return NEW;
    }
}


class SinglyLinkedList_REVERSE_Add_DIGITS {
    public static void main(String[] args) {
        Solution sn = new Solution();
        ListNode n11 = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n21 = new ListNode(3);
        ListNode n22 = new ListNode(4);
        n11.next = n12;
        n21.next = n22;
        ListNode head = sn.addTwoNumbers(n11,n21);
        System.out.println(head.val);
    }
}