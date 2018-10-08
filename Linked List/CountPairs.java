/* Given two linked list of size N1 and N2 respectively of distinct elements, complete the function countPairs(), 
* which returns the count of all pairs from both lists whose sum is equal to the given value X. */

import java.util.*;
public class CountPairs {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        /* Input the length of first linked list */
        int length1 = sc.nextInt();
        
        Node h1=null,curr=null;
        
        while(length1-->0){
            /* Input each node's value for first linked list */
            int v=sc.nextInt();
            if(curr==null){
                h1=new Node(v);
                curr=h1;
            }else{
                curr.next=new Node(v);
                curr=curr.next;
            }
        }
        
        /* Input the length of second linked list */
        int length2 = sc.nextInt();
        Node h2=null,curr2=null;
        while(length2-->0){
             /* Input each node's value for second linked list */
            int v=sc.nextInt();
            if(curr2==null){
                h2=new Node(v);
                curr2=h2;
            }else{
                curr2.next=new Node(v);
                curr2=curr2.next;
            }
        }
        
        /* Input the required sum */
        int sum=sc.nextInt();
        
        System.out.println("\nList 1:"); print(h1);
        System.out.println("\nList 2:"); print(h2);
        
        /* Call the countPairs method to calculate the number of pairs */
        int count = countPairs(h1,h2,sum);
        System.out.println("\nCount: "+count);
    }
    
    public static int countPairs(Node head1, Node head2, int sum){
        HashMap<Integer,Integer> count = new HashMap<>();
        Node curr=head1;
        while(curr!=null){
            if(count.get(curr.data)==null){
                count.put(curr.data,1);
            }else{
                count.put(curr.data,count.get(curr.data)+1);
            }
            curr=curr.next;
        }
        int pairs=0;
        curr=head2;
        while(curr!=null){
            if(count.containsKey(sum-curr.data)){
                if(count.get(sum-curr.data)!=null || count.get(sum-curr.data)!=0){
                    pairs++;
                    count.put(sum-curr.data,count.get(sum-curr.data)-1);
                }
            }
            curr=curr.next;
        }
        return pairs;
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
