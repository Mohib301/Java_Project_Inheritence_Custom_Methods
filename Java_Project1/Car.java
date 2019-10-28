package Java_Project1;

public class Car extends Vehicle {

	
	private boolean engineStatus;
	protected int currentSpeed;
	private double mpg;
	

	public Car() {
		super();
		engineStatus = false;
		currentSpeed = 0;
		mpg = 0.0;
		
	}
	
	
	
	public Car(boolean engineStatus, int currentSpeed, double mpg, String owner, String name,String make, String model, int maxSpeed,int year) {
		super(owner, name, make, model, maxSpeed, year);
		
		this.engineStatus = engineStatus;
		this.currentSpeed = currentSpeed;
		this.mpg = mpg;
	}
	
	
	
     //getters and setters	
	public boolean getEngineStatus() {
		return engineStatus;
	}
	
	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus; 
	}
	
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	

	public double getMpg() {
		return mpg;
	}
	
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}
	
	
	
	
	@Override
	public String toString() {
	
		return " Engine status: "+engineStatus+ " Current Speed: "+currentSpeed +" Mile per Gallon: "+ mpg+ " Owner: "+ getOwner()+ " Name: "+getName()
		+" Make: "+getMake()+" Model: "+getModel()+" Max Speed: "+getMaxSpeed()+" Year: "+getYear();
		
		
	}
	
	
	//BeakAbit custom method	
	public  void BreakAbit() {
		currentSpeed  -= 5;
	}
		
		//Break custom method
	public void Break() {
		 currentSpeed = 0;
	}
	
	//Start Engine custom method
	public void StartEngine() {
	  engineStatus = true;
	}
	
	//Off Engine custom method
	public void OffEngine () {
		 engineStatus =false;
		 currentSpeed = 0;
	}
	
	//Speed Up custom method
	public void SpeedUp() {
		if (currentSpeed >=currentSpeed) {
			currentSpeed++;
		}
		
	}	
	
}