/* Program to remove N nodes after every M nodes in a linked list */

public class RemoveNafterM {
    public static void main(String args[]) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(7);
        head.next.next.next.next.next.next.next=new Node(8);
        head.next.next.next.next.next.next.next.next=new Node(9);
        
        int m=2,n=1; //define the values of m and n
        System.out.println("original linked list: ");
        print(head);
        Node newHead=removenafterm(head,m,n);
        System.out.println("\nnew linked list: ");
        print(newHead);
        
    }
    public static Node removenafterm(Node head,int m,int n){
        Node mptr=head,nptr=head;
        while(mptr!=null && nptr!=null){
            int c=1;
            while(mptr.next!=null && c<m){
                mptr=mptr.next;
                c++;
            }
            nptr=mptr.next;
            c=1;
            if(nptr==null){
                mptr.next=null;
                return head;
            }
            while(nptr.next!=null && c<n){
                nptr=nptr.next;
                c++;
            }
            mptr.next = nptr.next;
            mptr=mptr.next;
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
