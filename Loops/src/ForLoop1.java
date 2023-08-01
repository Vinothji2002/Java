import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
		int n=1;
		while(n>0){
			System.out.println("KodMan studied "+" "+n+"page");
			System.out.println("Are you bored?");
			boolean b=scan.nextBoolean();
			
			n++;
			
			}
	}

}
