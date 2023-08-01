
public class Amstrong {
	public int check(int n,int count) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+(int)Math.pow(rem, count);
			n=n/10;
		}
		return sum;
	}
}
