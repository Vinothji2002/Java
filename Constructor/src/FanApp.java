
public class FanApp {
	public static void main(String[] args) {
		Fan f1=new Fan("Crompton","White",4000);
		f1.blows_Air();
		f1.rotate();
		System.out.println("====================================");
		new Fan("Usha","Red",4000).rotate();
	}
}
