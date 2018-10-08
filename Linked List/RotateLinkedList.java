/* Program to rotate linked list k times in a counter-clockwise fashion */

public class RotateLinkedList {
    public static void main(String args[]) {
        
        /*  1->2->3->4->5->6  */
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        
        /* DEFINE VALUE OF K - NUMBER OF ROTATIONS COUNTER-CLOCKWISE */
        int k = 4; 
        
        System.out.println("original linked list: ");
        print(head);
        Node newHead=rotate(head,k);
        System.out.println("\nrotated linked list: ");
        print(newHead);
        
    }
    public static Node rotate(Node head,int k){
        Node prev = head;
        while(prev.next!=null){
            prev=prev.next;
        }
        while(k-->0){
            /* REMOVE HEAD AND ADD TO END OF LINKED LIST */
            Node addNode = head;
            head=head.next;
            addNode.next = null;
            prev.next = addNode;
            prev=prev.next;
        }
        return head;
    }
    public static void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
