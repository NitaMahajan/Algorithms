public class ReverseLinkedList {
    public static void main(String args[]) {
        Node head=new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        
        System.out.println("Original linked list: ");
        print(head);
        Node newHead = reverseLinkedList(head);
        System.out.println("\nNew linked list: ");
        print(newHead);
    }
    public static void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"  ");
            curr=curr.next;
        }
    }
    public static Node reverseLinkedList(Node head){
        Node prev = null,curr=head,next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        next=null;
        this.data = data;
    }
}
