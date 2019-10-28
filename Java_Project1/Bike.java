package Java_Project1;

public class Bike extends Vehicle {
	
       private int curentSpeed;
	
     	public Bike() {
          super();
          curentSpeed = 0;
      }
	
	
	public Bike( int curentSpeed,String owner,String name, String make,String model, int maxSpeed, int year) {
		super(owner, name, make, model, maxSpeed, year);
		this.curentSpeed = curentSpeed;
	
	}
	
	//getters and setters
public int getSpeed() {
		return curentSpeed;
}
	public void setSpeed(int Speed) {
		this.curentSpeed = Speed;
	}
	
	@Override
	public String toString() {
	
		return "Speed: "+curentSpeed +  " Owner: "+ getOwner()+ " Name: "+getName()
		+" Make: "+getMake()+" Model: "+getModel()+" Max Speed: "+getMaxSpeed()+" Year: "+getYear();
		
	}
	
	//BreakAbit custom method
	public  void BreakAbit() {
		curentSpeed-= 2;
		}
	
	//Break custom method
    public int Break() {
		return curentSpeed = 0;
	}
	
}