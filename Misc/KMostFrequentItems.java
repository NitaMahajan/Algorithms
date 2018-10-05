/* Find the  K-most frequent items in a given array */

import java.util.*;
public class KMostFrequentItems {
    public static void main(String args[]) {
        int a[]={1,6,2,1,1,6,6};
        int k=2;
        int frequent_items[] = findKFrequentItems(a,k);
        System.out.println("The "+k+" frequent items are: ");
        for(int i=0;i<k;i++){
            System.out.println(frequent_items[i]);
        }
    }
    static int[] findKFrequentItems(int a[],int k){
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(count.containsKey(a[i])){
                count.put(a[i],count.get(a[i])+1);
            }else{
                count.put(a[i],1);
            }
        }
        /* Sort the hashmap keys using the values in descending order */
        List list = new LinkedList(count.keySet());
        Collections.sort(list,new Comparator(){
            public int compare(Object o1,Object o2){
                return (count.get((Integer)o2)-count.get((Integer)o1));
            }
        });
        
        int frequent_items[]=new int[k];
        int c=0;
        for(Object i:list){
            if(c<k){
                frequent_items[c]=(Integer)i;
                c++;
            }
        }
        return frequent_items;
    }
}
