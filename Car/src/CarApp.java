import java.util.*;
public class CarApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Car brand");
		String brand=sc.next();

		System.out.println("Enter the Car model");
		String model=sc.next();

		System.out.println("Enter the Car colour");
		String colour=sc.next();

		System.out.println("Enter the Car Fuel Type");
		String fuelType=sc.next();

		System.out.println("Enter the Car Fuel Capacity");
		int fuelCapacity=sc.nextInt();

		System.out.println("Enter the Car mileage");
		int mileage=sc.nextInt();

		System.out.println("Enter the Car No of Seats");
		int noOfSeats=sc.nextInt();

		System.out.println("Enter the Car Horse Power");
		int horsePower=sc.nextInt();

		System.out.println("Enter the no of airbags");
		int airbag=sc.nextInt();

		System.out.println("Enter the no of tires");
		int tires=sc.nextInt();
		
		Car c=new Car(brand,model,colour,fuelType,fuelCapacity,mileage,noOfSeats,horsePower,airbag,tires);
		c.drive();
	}
}
