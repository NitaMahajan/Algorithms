package DP;

/* Fibonnaci Series Using Memoization */

public class Fibonnaci {

	public static void main(String args[]){
		int n=7; //0,1,2,3,4
		int fib[] = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		System.out.println(FindNthFib(n,fib));
	}
	static int FindNthFib(int n, int fib[]){
		if(n==0 || n==1) return fib[n];
		if(fib[n-1]!=0 && fib[n-2]==0){
			int res = FindNthFib(n-2,fib);
			fib[n-2] = res;
		}
		else if(fib[n-2]!=0 && fib[n-1]==0){
			int res = FindNthFib(n-1,fib);
			fib[n-1] = res;
		}
		else if(fib[n-1]==0 && fib[n-2]==0){
			int res1 = FindNthFib(n-1,fib);
			fib[n-1] = res1;
			int res2 = FindNthFib(n-2,fib);
			fib[n-2] = res2;
		}
		return fib[n-1]+fib[n-2];
	}
}
