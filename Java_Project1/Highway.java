package Java_Project1;

import java.util.ArrayList;

public class Highway {
	
	private String name;
	private int maxSpeedLimit;
	private int minSpeedLimit;
	private ArrayList<Car> listOfCarsOnRoad;
	
	
	public Highway() {
		name = "";
		maxSpeedLimit = 0;
		minSpeedLimit = 0;
		listOfCarsOnRoad = new ArrayList<Car>();
	}
	
	
	
	public Highway(String name, int maxSpeedLimit, int minSpeedLimit, ArrayList<Car> listOfCarsOnRoad) {
		this.name = name;
		this.maxSpeedLimit = maxSpeedLimit;
		this.minSpeedLimit = minSpeedLimit;
		this.listOfCarsOnRoad = listOfCarsOnRoad;
	}

	
	public Highway(String name, int maxSpeedLimit, int minSpeedLimit) {
		this.name = name;
		this.maxSpeedLimit = maxSpeedLimit;
		this.minSpeedLimit = minSpeedLimit;
		listOfCarsOnRoad = new ArrayList<Car>();
		
	}
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	public int getMaxSpeedLimit() {
		return maxSpeedLimit;
	}
	
	
	public void setMaxSpeedLimit(int maxSpeedLimit) {
		this.maxSpeedLimit = maxSpeedLimit;
	}
	
	
	
	public int getMinSpeedLimit() {
		return minSpeedLimit;
	}
	
	public void setMinSpeedLimit(int minSpeedLimit) {
		this.minSpeedLimit = minSpeedLimit;
		
	}
	public ArrayList<Car> getListOfCarsOnRoad() {
		return listOfCarsOnRoad;
	}
	
	public void setListOfCarsOnRoad(ArrayList<Car> listOfCarsOnRoad) {
		this.listOfCarsOnRoad = listOfCarsOnRoad;
	}
	
	
	
	
@Override
	public String toString() {
		
		return "High way name: " + name + "max speed limit: " + maxSpeedLimit + "min speed limit: " + minSpeedLimit +
				"list of cars on road: " + listOfCarsOnRoad;
	}
	
      //addCarToTheHighway custom method
     public void addCarToTheHighway(Car newCar) {
	           listOfCarsOnRoad.add(newCar);

    }
     
     //removeCarFromHighway custom method
	 public void removeCarFromHighway(Car newCar) {
		       listOfCarsOnRoad.remove(newCar);
	}
	
	//ListOfCarsBellowSpeed custom method
	 public ArrayList<Car> getListOfCarsBellowSpeed (){
		ArrayList<Car> bellowSpeed = new ArrayList<Car>();
		
	    	for (Car b: listOfCarsOnRoad) {
		    	if(b.getCurrentSpeed() < minSpeedLimit) {
			        	bellowSpeed.add(b);
			}
		}
	
		return bellowSpeed;
	}
	
	 //ListOfCarsAboveSpeed custom method
	public ArrayList<Car> getListOfCarsAboveSpeed(){
		ArrayList<Car> aboveSpeed = new ArrayList<Car>();
		
	      	for (Car a : listOfCarsOnRoad) {
		      	if(a.getCurrentSpeed() > maxSpeedLimit) {
			        	aboveSpeed.add(a);
			}
		}
		return aboveSpeed;
		}
		
	//ListOfCarsStoppedonHighway custom method
	public ArrayList<Car> getListOfCarsStoppedonHighway(){
		ArrayList<Car> stopped = new ArrayList<Car>();
		
		   for (Car s: listOfCarsOnRoad) {
			     if(s.getEngineStatus()==false) {
			    	 stopped.add(s);
			}
		}
		return stopped;
		}
	
	}