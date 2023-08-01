import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark=scan.nextInt();
		if(mark<50) {
			System.out.println("D grade");
			System.out.println("Congratulatins!!");
		}
		else if(mark>=50 && mark<60) {
			System.out.println("C grade");
			System.out.println("Congratulatins!!");
		}
		else if(mark>=60 && mark<70) {
			System.out.println("b grade");
			System.out.println("Congratulatins!!");
		}
		else if(mark>=70 && mark<80) {
			System.out.println("A grade");
			System.out.println("Congratulatins!!");
		}
		else {
			System.out.println("A+ grade");
			System.out.println("Congratulatins!!");
		}
	}

}
