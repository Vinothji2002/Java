public class Pattern12 {
	public static void main(String[] args) {
		for(int i=6;i>=1;i--) {
			for(int j=i;j>1;j--) {
				System.out.print(" ");
			}
			for(int k=i;k<=6;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
