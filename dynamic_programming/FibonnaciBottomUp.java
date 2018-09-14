public class FibonnaciBottomUp {

	public static void main(String[] args) {
		int n=19;
		System.out.println(Fib(n));
	}
	static int Fib(int n){
		int fib[] = new int[n+1];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<=n;i++){
			fib[i]=fib[i-1]+fib[i-2];
		}
		return fib[n];
	}
}
