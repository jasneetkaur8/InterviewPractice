package leetcode;
/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */

public class AddTwoLinkedLists {

	public static void main(String[] args) {
		ListNode l1 =new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		ListNode res = addTwoNumbers(l1,l2);
		while(res!=null){
			System.out.println(res.val);
			res=res.next;
		}
		

	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){
            return null;
        }
        if(l1==null || l1.val==0){
            return l2;
        }
        if(l2==null || l2.val==0){
            return l1;
        }
        int carry = 0;
        int sum =0;
        ListNode res = new ListNode(0);
        ListNode ref = res;
        
        while(l1!=null && l2!=null){
            
            sum = l1.val+l2.val+carry;
            ref.next=new ListNode(sum%10);
            carry = sum/10;
            l1=l1.next;
            l2=l2.next;
            ref = ref.next;
        }
        while(l1!=null){
            ref.next = new ListNode((carry+l1.val)%10);
            carry = (carry+l1.val)/10;
            l1=l1.next;
            ref=ref.next;
        }
        while(l2!=null){
            ref.next = new ListNode((carry+l2.val)%10);
            carry = (carry+l2.val)/10;
            l2=l2.next;
            ref=ref.next;
        }
        if(carry>0){
            ref.next=new ListNode(carry);
        }
            
        return res.next;  
       
        
    }

}
class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
/* More concise solution
 * public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
*    ListNode dummyHead = new ListNode(0);
 *   ListNode p = l1, q = l2, curr = dummyHead;
  *  int carry = 0;
*    while (p != null || q != null) {
 *       int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
}
*/
/*recursive solution
*V
vishmaram commented last week
Below is another solution with recursive call:

public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
{
if(l1==null)return l2;
else if(l2==null) return l1;
else
{
int val = l1.val+l2.val>=10?l1.val+l2.val-10:l1.val+l2.val;
ListNode result = new ListNode(val);
result.next = addTwoNumbers(l1.next,l2.next);
if(l1.val+l2.val>=10)
result.next = addTwoNumbers(result.next,new ListNode(1));
return result;
}
}
*/