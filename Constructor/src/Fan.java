public class Fan {
	String brand;
	String colour;
	int cost;
	void blows_Air() {
		System.out.println(brand+" Fan is blows air");
	}
	void rotate() {
		System.out.println(brand+" "+colour+" Fan is rotating");
	}
	public Fan(String a,String b,int c) {
		brand=a;
		colour=b;
		cost=c;
	}
}
