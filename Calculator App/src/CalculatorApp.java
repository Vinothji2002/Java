import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Calculator calc=new Calculator();
		System.out.println("Welcome to KodNest Calculator......");
		while(true) {
			System.out.println("+ ---> Addition");
			System.out.println("- ---> Subraction");
			System.out.println("* ---> Multiplication");
			System.out.println("/ ---> Division");
			System.out.println("% ---> Remainder");
			System.out.println("^ ---> Squaring the number");
			System.out.println("! ---> Exit");
			System.out.println("Choose an option");
			char ch=scan.next().charAt(0);
				switch(ch) {
				case '+':calc.addition();
					break;
				case '-':calc.subraction();
					break;
				case '*':calc.multiplication();
					break;
				case '/':calc.division();
					break;
				case '%':calc.findRemainder();
					break;
				case '^':calc.findSquare();
					break;
				case '!':System.out.println("Tata bye bye see yoooooooooooou");
				return;
				default:System.out.println("Go to Vasan eye care and check your eyes. See the message properly..........");
				}
		}
	}
}
