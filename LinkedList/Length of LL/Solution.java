class Node {
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
    public static int length(Node head){
        if(head == null){
            return 0;
        }

        Node ptr = head;
        int count = 0;
        while(ptr != null){
            ptr = ptr.next;
            count++;
        }
        return count;
    }
}