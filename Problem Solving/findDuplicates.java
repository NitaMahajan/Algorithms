/** Given an array of n elements which contains elements from 0 to n-1, 
* with any of these numbers appearing any number of times. 
* Find these repeating numbers in O(n) and using only constant memory space. **/

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int a[]={1,2,3,1,3,6,6};
        HashSet<Integer> dups=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                if(a[a[i]]<0){
                    dups.add(a[i]);
                }
                a[a[i]]=a[a[i]]*(-1);
            }else{
                if(a[(a[i]*(-1))]<0){
                    dups.add(a[i]*(-1));
                }
                a[a[i]*(-1)]=a[a[i]*(-1)]*(-1);
            }
        }
        System.out.println(dups);
    }
}
