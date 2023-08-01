public class Dog {
	String name;
	String breed;
	String colour;
	int age;
	void eat() {
		System.out.println(name+" dog is eating");
	}
	void sleep() {
		System.out.println(name+" "+colour+" coloured dog is sleeping");
	}
	void bark() {
		System.out.println(name+" "+breed+" "+colour+" coloured dog which is of age "+age+" year is barking");
	}
	public Dog() {
		name="Jimmy";
		breed="Bulldog";
		colour="Brown";
		age=3;
	}
	public Dog(String a) {
		name=a;
		breed="German Shepherd";
		colour="Black";
		age=3;
	}
	public Dog(String a,String b){
		name=a;
		breed="b";
		colour="White";
		age=2;
	}
	public Dog(String a,String b,String c){
		name=a;
		breed="b";
		colour=c;
		age=2;
	}
	public Dog(String a,String b,String c,int d){
		name=a;
		breed="b";
		colour=c;
		age=d;
	}
	public Dog(String a,String b,int c){
		name=a;
		breed="b";
		colour="Sandal";
		age=c;
	}
	public Dog(String a,String b,int d,String c){
		name=a;
		breed="b";
		colour=c;
		age=d;
	}
	public Dog(int a) {
		name="Spike";
		breed="French Bulldog";
		colour="White";
		age=a;
	}
}
