package Java_Project1;

public class Sedan extends Car {

	
    public	Sedan() {
    	super();
    
        }

	//constructor method
	public Sedan(boolean engineStatus, int currentSpeed, double mpg, String owner, String name,String make, String model, int maxSpeed,int year) {
	super(engineStatus, currentSpeed, mpg, owner, name, make, model, maxSpeed, year);
       }	
	
	@Override
	public String toString() {
	
		return "current Speed: "+ currentSpeed + " Owner= "+ getOwner()+ " Name= "+getName()
		+" Make= "+getMake()+" Model= "+getModel()+" Max Speed= "+getMaxSpeed()+" Year= "+getYear();
		
	}
	
	//BreakAbit custom method
	public void BreakAbit() {
			currentSpeed  -= 7;
		}
	
}