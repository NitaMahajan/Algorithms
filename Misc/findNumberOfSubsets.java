/* Given an array of non-negative integers, find the number of subsets that contains elements that sum up to a particular given sum */

public class findNumberOfSubsets {
    public static void main(String args[]) {
        int a[]={1,2,3,4,5};
        int n=10;
        int count = findNumArray(a,0,n,0);
        System.out.println(count);
    }
    static int findNumArray(int a[],int sum,int n,int index){
        int count=0;
        if(index<a.length){
            if((sum+a[index]) == n){
                count++;
            }else{
                if((sum+a[index]) < n){
                    count = count + findNumArray(a,sum+a[index],n,index+1);
                }
                count = count+findNumArray(a,sum,n,index+1);
            }
        }
        return count;
    }
}
