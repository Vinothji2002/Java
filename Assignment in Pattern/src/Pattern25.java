public class Pattern25 {
	public static void main(String[] args) {
		for (int i=1;i<=6;i++) {
			int n=65;
			if(i==6) {
				for(int j=0;j<i;j++)
					if(j==0 || j==5)
						System.out.print((char)(n+i-1)+" ");
					else
						System.out.print("  ");
			}
			else {
				for (int j=i;j<6;j++) {
	                System.out.print(" ");
	            }
	            for (int k=1;k<=(2*i-1);k++) {
	                if (k==1 || k==(2*i- 1)) {
	                    System.out.print((char)(n+i-1));
	                }
	                else {
	                    System.out.print(" ");
	                }
	            }
			}
            System.out.println();
        }
		for (int i=5;i>=1;i--) {
			int n=65;
			for (int j=i;j<6;j++) {
				System.out.print(" ");
			}
			for (int k=1;k<=(2*i-1);k++) {
				if (k==1 || k==(2*i-1)) {
					System.out.print((char)(n+i-1));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}