import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		int i,fact=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}

}
