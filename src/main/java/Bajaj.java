package week3.assignments;

public class Bajaj extends Bike {
	
	public static void main(String[] args) {
		
		Bajaj bajaj= new Bajaj();
		bajaj.cost(50000);
		bajaj.speed();
		
		
		
	}

	@Override
	public void speed() {
		
		String s= "80km/hr";
		System.out.println("Speed is " +s);
		
	}

}
