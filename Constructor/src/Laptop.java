
public class Laptop {
	String brand;
	String colour;
	int cost;
	void doOperation() {
		System.out.println(brand+" "+colour+" coloured laptop which cost "+cost+" is being processing");
	}
	public Laptop(String a,String b,int c) {
		brand=a;
		colour=b;
		cost=c;
	}
}
