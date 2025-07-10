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

    static Node insert(Node head, int n, int pos, int val) {
        
        //creating new node
        Node newNode = new Node(val);
        
        //if pos is 0 then make it head.
        if (pos == 0){
            newNode.next = head;
            head = newNode;
        }
           
        else{
            Node ptr = head;
            for(int i=1; i<=n; i++){
                if(pos == i){
                    newNode.next = ptr.next;
                    ptr.next = newNode;
                    return head;
                } 
                ptr = ptr.next;
            }
        }
        return head;

    }
}