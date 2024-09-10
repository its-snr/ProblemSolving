/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode first=head;
        ListNode second=head.next;
        if(head.next==null)return head;
        while(first.next!=null){
            int a=first.val;
            int b=second.val;
            int gcd=gcd(a,b);
            ListNode mid=new ListNode(gcd);
            first.next=mid;
            mid.next=second;
            second=second.next;
            first=first.next.next;

        }
        return head;
        
    }
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0)return a;
        else return a>b?gcd(a-b,b):gcd(a,b-a);
    }
}