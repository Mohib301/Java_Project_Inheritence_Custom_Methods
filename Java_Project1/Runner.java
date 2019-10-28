package Java_Project1;

public class Runner {

	public static void main(String[] args) {

	
	
	System.out.println("******These bellow custom methods and other class custom methods works fine. Here is a few just for testing******\n");
	Car car1 = new Car(true, 65, 1.5, "Mike Shelton", "Corrolla", "Toyota", "LE", 180, 2019);
		
	//speedup
	System.out.println("car info=>   "+car1);
	//speedup
	car1.SpeedUp();
	System.out.println("\nspeed Up=>    "+car1);
		
	//BreakAbit
     car1.BreakAbit();
    	System.out.println("BreakAbit=>   "+car1);
    	
    	//Break
     car1.Break();
       System.out.println("Break=>       "+car1);
	
       //Start Engine
     car1.StartEngine();
         System.out.println("StartEngine=> "+car1);

         //Off engine
	 car1.OffEngine();
	     System.out.println("Off Engnie=>  "+car1);


	//Create 5 objects of highways and 10 different cars.
   Highway hw95 = new Highway("highway 95", 70, 50);
   Highway hw64 = new Highway("highway 64", 70, 40);
   Highway hw288 = new Highway("highway 288", 70, 45);
   Highway hw20 = new Highway("highway 20", 70, 50);
   Highway hw360 = new Highway("highway 360", 70, 40);
   
   
   //10 different cars
   Car car001 = new Car(true, 70, 1.2, "Moose", "civic", "Honda", "sedan", 220, 2009);
   Car car002 = new Car(false, 0, 2.4, "mustafa", "Audi", "Germani", "sport", 380, 2019);
   Car car003 = new Car(true, 50, 1.9, "jahana", "Benz", "Benz germani", "sedan", 220, 2019);
   Car car004 = new Car(false, 0, 2.1, "Sara", "BMW", "germani", "sport", 380, 2020);
   Car car005 = new Car(true, 65, 1.4, "Hamayoun", "toyota", "corrola", "sedan", 110, 1970);
   Car car006 = new Car(false, 0, 2.7, "Tariq", "Tunis", "germani", "Van", 115, 1989);
   Car car007 = new Car(true, 90, 1.9, "Naghma", "Camry", "toyota", "sedan", 220, 2015);
   Car car008 = new Car(true, 55, 2.6, "Anzur Gul", "toyota", "germani", "van", 120, 1995);
   Car car009 = new Car(true, 95, 3.9, "Micheal", "Luxces", "American", "sedan", 420, 216);
   Car car010 = new Car(true, 25, 2.2, "Jacky", "Honda", "germani", "Van", 210, 2008);
	
   
   hw95.addCarToTheHighway(car001);
   hw95.addCarToTheHighway(car002);
   hw95.addCarToTheHighway(car003);
   hw95.addCarToTheHighway(car004);
   hw95.addCarToTheHighway(car005);
   hw95.addCarToTheHighway(car006);
   hw95.addCarToTheHighway(car007);
   hw95.addCarToTheHighway(car008);
   hw95.addCarToTheHighway(car009);
   hw95.addCarToTheHighway(car010);
  
   System.out.println("\n*********Above speed cars on HighWay 95 ******");
   for (Car x: hw95.getListOfCarsAboveSpeed()) {
	   System.out.println("Car above speed=> "+x.toString());
   }
   
   System.out.println("\n*********bellow speed cars on HighWay 95 ******");
   for (Car x: hw95.getListOfCarsBellowSpeed()) {
	   System.out.println("car bellow speed=> "+x.toString());
   }
   
   System.out.println("\n*********stopped cars on HighWay 95 ******");
   for (Car x: hw95.getListOfCarsStoppedonHighway()) {
	   System.out.println("stopped car=> "+x.toString());
   }
 
   
   hw64.addCarToTheHighway(car001);
   hw64.addCarToTheHighway(car002);
   hw64.addCarToTheHighway(car003);
   hw64.addCarToTheHighway(car004);
   hw64.addCarToTheHighway(car005);
   hw64.addCarToTheHighway(car006);
   hw64.addCarToTheHighway(car007);
   hw64.addCarToTheHighway(car008);
   hw64.addCarToTheHighway(car009);
   hw64.addCarToTheHighway(car010);
   
   System.out.println("\n*********Above speed cars on HighWay 64 ******");
   for (Car x: hw64.getListOfCarsAboveSpeed()) {
	   System.out.println("Car above speed=> "+x.toString());
   }
   
   System.out.println("\n*********bellow speed cars on HighWay 64 ******");
   for (Car x: hw64.getListOfCarsBellowSpeed()) {
	   System.out.println("car bellow speed=> "+x.toString());
   }
   
   System.out.println("\n*********stopped cars on HighWay 64 ******");
   for (Car x: hw64.getListOfCarsStoppedonHighway()) {
	   System.out.println("stopped car=> "+x.toString());
   }
   hw288.addCarToTheHighway(car001);
   hw288.addCarToTheHighway(car002);
   hw288.addCarToTheHighway(car003);
   hw288.addCarToTheHighway(car004);
   hw288.addCarToTheHighway(car005);
   hw288.addCarToTheHighway(car006);
   hw288.addCarToTheHighway(car007);
   hw288.addCarToTheHighway(car008);
   hw288.addCarToTheHighway(car009);
   hw288.addCarToTheHighway(car010);
   
   System.out.println("\n*********Above speed cars on HighWay 288 ******");
   for (Car x: hw288.getListOfCarsAboveSpeed()) {
	   System.out.println("Car above speed=> "+x.toString());
   }
   
   System.out.println("\n*********bellow speed cars on HighWay 288 ******");
   for (Car x: hw288.getListOfCarsBellowSpeed()) {
	   System.out.println("car bellow speed=> "+x.toString());
   }
   
   System.out.println("\n*********stopped cars on HighWay 288 ******");
   for (Car x: hw288.getListOfCarsStoppedonHighway()) {
	   System.out.println("stopped car=> "+x.toString());
   }
   
   hw20.addCarToTheHighway(car001);
   hw20.addCarToTheHighway(car002);
   hw20.addCarToTheHighway(car003);
   hw20.addCarToTheHighway(car004);
   hw20.addCarToTheHighway(car005);
   hw20.addCarToTheHighway(car006);
   hw20.addCarToTheHighway(car007);
   hw20.addCarToTheHighway(car008);
   hw20.addCarToTheHighway(car009);
   hw20.addCarToTheHighway(car010);
   
   System.out.println("\n*********Above speed cars on HighWay 20 ******");
   for (Car x: hw20.getListOfCarsAboveSpeed()) {
	   System.out.println("Car above speed=> "+x.toString());
   }
   
   System.out.println("\n*********bellow speed cars on HighWay 20 ******");
   for (Car x: hw20.getListOfCarsBellowSpeed()) {
	   System.out.println("car bellow speed=> "+x.toString());
   }
   
   System.out.println("\n*********stopped cars on HighWay 20 ******");
   for (Car x: hw20.getListOfCarsStoppedonHighway()) {
	   System.out.println("stopped car=> "+x.toString());
   }
   hw360.addCarToTheHighway(car001);
   hw360.addCarToTheHighway(car002);
   hw360.addCarToTheHighway(car003);
   hw360.addCarToTheHighway(car004);
   hw360.addCarToTheHighway(car005);
   hw360.addCarToTheHighway(car006);
   hw360.addCarToTheHighway(car007);
   hw360.addCarToTheHighway(car008);
   hw360.addCarToTheHighway(car009);
   hw360.addCarToTheHighway(car010);
   System.out.println("\n*********Above speed cars on HighWay 360 ******");
   for (Car x: hw360.getListOfCarsAboveSpeed()) {
	   System.out.println("Car above speed=> "+x.toString());
   }
   
   System.out.println("\n*********bellow speed cars on HighWay 360 ******");
   for (Car x: hw360.getListOfCarsBellowSpeed()) {
	   System.out.println("car bellow speed=> "+x.toString());
   }
   
   System.out.println("\n*********stopped cars on HighWay 360 ******");
   for (Car x: hw360.getListOfCarsStoppedonHighway()) {
	   System.out.println("stopped car=> "+x.toString());
   }
   
   
   
   
   System.out.println("\n\n____All other classes custom methods works fine___");
   System.out.println("\n________Class Bike________\n");
   
   
  Bike bike001 = new Bike(65,"Mujtaba", "Suzuki", "German", "Faster", 160, 2009);

  bike001.BreakAbit();
  System.out.println(bike001.toString());
  
	  bike001.Break();
   System.out.println(bike001.toString());
   
   
   System.out.println("\n________Class Sedan________\n");
   
   Sedan sedan001 = new Sedan(true, 75, 2.1, "Lee", "Cadillac", "Cadillac", "STS", 210, 2011);
   
   sedan001.BreakAbit();
   System.out.println(sedan001.toString());
   
   
   System.out.println("\n________Class SUV________\n");
   
   SUV suv001 = new SUV(true, 80, 2.4, "Rafi", "Infinity", "Nissan", "FZ30", 220, 2019);
   suv001.BreakAbit();
   System.out.println(suv001.toString());
   
   
   System.out.println("\n________Class Truck________\n");
   
   Truck truck001 = new Truck(true, 70, 2.9, "Joe", "Chevy", "Cheverolet", "F150", 200, 2013);
   truck001.BreakAbit();
   System.out.println(truck001.toString());
   
   
	}
}