/* Recursive staircase problem */
/* Given the steps array (which denotes the steps you can take at a time while climbing)
* find the number of ways to reach the 'n'th floor
*/

public class RecursiveStaircase {
    public static void main(String args[]) {
        
        //The steps array
        int steps[]={1,3,5};  
        
        // Destination floor
        int n=10;                   
        int a[]=new int[n+1];
        a[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<steps.length;j++){
                if(i>=steps[j]){
                    a[i] = a[i]+a[i-steps[j]];
                }
            }
        }
        System.out.println(a[n]);
    }
}
