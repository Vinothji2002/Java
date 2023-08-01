public class Pattern20 {
	public static void main(String[] args) {
		for (int i=0;i<=6;i++){  
			int n=65;   
			for (int j=6;j>i;j--){  
				System.out.print(" ");  
			}
		}  
		for (int k=0;k<=i;k++){  
			System.out.print((char)(n+k)+" ");  
		}  
		System.out.println();  
		}  
	}
}
