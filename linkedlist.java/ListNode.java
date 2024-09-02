//To find the middle of the element in a linked list
public class ListNode {
         int val;
         ListNode next;
         //ListNode() {}
         //ListNode(int val) { this.val = val; }
         // ListNode(int val, ListNode next) { this.val = val; this.next = next; } 
     }

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;
        ListNode lengthCheck = head;

        int n =1;
        while(lengthCheck.next != null) {
        lengthCheck = lengthCheck.next;
        n++;  
        }
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            tortoise= tortoise.next;

        }
        if(n%2==0){
            return tortoise.next;

        }
        return tortoise;
    }

    
}
