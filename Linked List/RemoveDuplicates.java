/* Remove duplicates from a sorted linked list */

public class RemoveDuplicates {
    public static void main(String args[]) {
        Node head=new Node(10);
        head.next=new Node(10);
        head.next.next=new Node(20);
        head.next.next.next=new Node(20);
        head.next.next.next.next=new Node(30);
        head.next.next.next.next.next=new Node(40);
        head.next.next.next.next.next.next=new Node(40);
        
        System.out.println("original linked list: ");
        print(head);
        Node newHead=removeDups(head);
        System.out.println("\nnew linked list: ");
        print(newHead);
        
    }
    public static Node removeDups(Node head){
        Node curr = head;
        while(curr.next!=null){
            while(curr.next!=null && curr.next.data==curr.data){
                curr.next = curr.next.next;
            }
            
            curr=curr.next;
            if(curr==null){
                break;
            }
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
