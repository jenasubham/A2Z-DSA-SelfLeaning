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
   public static void print(Node head){
       if(head == null){
           return;
       }

       Node ptr = head;
       while(ptr != null){
           System.out.print(ptr.data + " ");
           ptr = ptr.next;
       }
   }
}