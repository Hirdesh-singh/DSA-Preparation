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
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;

        }
        int l=0;
        int r=arr.size()-1;
        while(l<r){
            if(arr.get(l) !=arr.get(r)){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
        
    }
}