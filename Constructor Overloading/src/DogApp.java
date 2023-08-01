
public class DogApp {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.eat();
		d1.sleep();
		d1.bark();
		System.out.println("==============================");
		Dog d2=new Dog("Tommy");
		d2.eat();
		d2.sleep();
		d2.bark();
		System.out.println("==============================");
		Dog d3=new Dog("Lobo","Siberian Husky");
		d3.eat();
		d3.sleep();
		d3.bark();
		Dog d4=new Dog("Shady","Pomerian","Gold");
		d4.eat();
		d4.sleep();
		d4.bark();
		System.out.println("==============================");
		Dog d5=new Dog("Jimmy","Dachshund","Black",3);
		d5.eat();
		d5.sleep();
		d5.bark();
		System.out.println("==============================");
		Dog d6=new Dog("Tommy","Australian Shepherd",4);
		d6.eat();
		d6.sleep();
		d6.bark();
		System.out.println("==============================");
		Dog d7=new Dog("Jimmy","Dachshund",3,"Black");
		d7.eat();
		d7.sleep();
		d7.bark();
		System.out.println("==============================");
		Dog d8=new Dog(2);
		d8.eat();
		d8.sleep();
		d8.bark();
	}
}
