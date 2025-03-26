class Node{
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 public class Solution {
    public static Node deleteTailNode(Node head) {
        // Write Your Code Here.
        if(head == null || head.next == null){
            return null;
        }
        Node ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        ptr.next = null;
        return head;
    }
}