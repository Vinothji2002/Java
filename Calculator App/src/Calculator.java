import java.util.Scanner;

public class Calculator {
	Scanner scan=new Scanner(System.in);
	public void addition() {
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
	public void subraction() {
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Subraction of "+a+" and "+b+" is "+ (a-b));
	}
	public void multiplication() {
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("ultiplication of "+a+" and "+b+" is "+ (a*b));
	}
	public void division() {
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Division of "+a+" and "+b+" is "+ (a/b));
	}
	public void findRemainder() {
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("When "+a+" is divided by "+b+" gives the remainder as "+ (a%b));
	}
	public void findSquare() {
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Squaring "+a+" is "+ (a*a));
	}
}
