package Java_Project1;

public class SUV extends Car{
	
	public	SUV() {
		super();
	}

		
		public SUV(boolean engineStatus, int currentSpeed, double mpg, String owner, String name,String make, String model, int maxSpeed,int year) {
		super(engineStatus, currentSpeed, mpg, owner, name, make, model, maxSpeed, year);
	}	

		@Override
		public String toString() {
		
			return "current Speed: "+ currentSpeed + " Owner= "+ getOwner()+ " Name= "+getName()
			+" Make= "+getMake()+" Model= "+getModel()+" Max Speed= "+getMaxSpeed()+" Year= "+getYear();
			
		}
		
		public void BreakAbit() {
				currentSpeed  -= 4;
			}
}
