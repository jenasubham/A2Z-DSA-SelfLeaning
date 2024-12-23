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

public class Solution
{
    public static int searchInLinkedList(Node head, int k)
    {
        Node ptr = head;
        while(ptr != null){
            
            if(ptr.data == k){
                return 1;
            }
            ptr = ptr.next;
        }
        return 0;
    }
}