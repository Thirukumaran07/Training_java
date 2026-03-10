public class PrimeSieve{
    // sieve eratosthanes
    public static void sieve(int n){
		boolean is[]=new boolean[n+1];
		for(int i=0; i<=n; i++)is[i]=true;
		for(int i=2; i*i<=n; i++) {
			if(is[i]) {
				for(int j=i*i; j<=n; j+=i) {
					is[j]=false;
				}
			}
		}
		for(int i=2; i<=n; i++) {
			if(is[i])System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int n=9;
		sieve(n);
	}
}