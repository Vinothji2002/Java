
public class Pattern8 {

	public static void main(String[] args) {
//		for(int i=6;i>=1;i--) {
//			for(int j=6;j>=i;j--) {
//				System.out.print("*");
//			}
//			for(int k=1;k<i*2-1;k++){
//				System.out.print(" ");
//			}
//			for(int m=6;m>=i;m--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<i*2-1;k++) {
				System.out.print(" ");
			}
			for(int m=i;m<=6;m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
