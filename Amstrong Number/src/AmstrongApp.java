import java.util.Scanner;

public class AmstrongApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an number ");
		int n=scan.nextInt();
		int original=n;
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		Amstrong amstrong=new Amstrong();
		int res=amstrong.check(original,count);
		System.out.println(res);
		if(original==res) {
			System.out.println("The given number "+original+" is a Amstrong number");
		}
		else {
			System.out.println("The given number "+original+" is not a Amstrong number");
		}
	}

}
