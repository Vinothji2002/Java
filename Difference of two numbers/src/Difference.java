import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>b) {
			int res=b-a;
			System.out.println("Result is: "+res);
		}
		else {
			int res=a-b;
			System.out.println("Result is: "+res);
		}
	}

}
