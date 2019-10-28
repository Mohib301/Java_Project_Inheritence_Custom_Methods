package Java_Project1;

public class Vehicle {

	
	
	private String owner;
	private String name;
	private String make;
	private String model;
	private int maxSpeed;
	private int year;

	
	public Vehicle () {
		owner = "";
		name = "";
		make = "";
		model = "";
		maxSpeed = 0;
		year = 0;
	}
	
	
	
	
	public Vehicle(String owner, String name, String make, String model, int maxSpeed, int year) {
		this.owner = owner;
		this.name = name;
		this.make = make;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.year = year;
	}
	
	//getters and setters 
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.model = owner;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		}
	
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	

}