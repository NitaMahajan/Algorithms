/* Given an array of integers, find the length of the longest consecutive subsequence of integers */

import java.util.*;
public class LongestConsecSubseq {
    public static void main(String args[]) {
        int a[]={2,1,6,9,4,3};
        int count = longestConsecSequence(a);
        System.out.println(count);
    }
    static int longestConsecSequence(int a[]){
        
       /* Using HashMap to remove any duplicates */
       HashMap<Integer,Integer> numbers = new HashMap<>();
       for(int i=0;i<a.length;i++){
           numbers.put(a[i],1);
       }
       
       int maxLen=-1;
       for(Integer i:numbers.keySet()){
           if(!numbers.containsKey(i-1)){
               /* This could be starting element */
               int len=1; int start=i;
               while(true){
                   if(numbers.containsKey(start+1)){
                       len++;
                       start++;
                   }else{
                       break;
                   }
               }
               if(len>maxLen){
                   maxLen=len;
               }
           }
       }
       return maxLen;
    }
    
}
