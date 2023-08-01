
public class Car {
  String brand;
	String model;
	String colour;
	String fuelType;
  int fuelCapacity;
  int mileage;
  int noOfSeats;
  int horsePower;
  int airBag;
	int tires;
	public Car(String brand,String model,String colour,String fuelType,int fuelCapacity,
  int mileage,int noOfSeats,int horsePower,int airBag,int tires) {
		super();
		this.brand = brand;
		this.model = model;
		this.colour = colour;
    this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.mileage = mileage;
		this.noOfSeats = noOfSeats;
		this.horsePower = horsePower;
		this.airBag = airBag;
		this.tires = tires;
	}
	void drive() {
		System.out.println("Raja is driving "+brand+" "+model+" which is of colour "+colour+" having "+airBag+" Airbags is a "+fuelType+" engine Car which is having Horsepower "+horsePower+" HP of Fuel capacity "+fuelCapacity+" litres will give the Mileage of "+mileage+" Km. It has "+tires+" tires and "+noOfSeats+" Seats.");
	}
}
