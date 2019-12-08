package day5.classroom;

public class MyMobile extends Mobile {

	public static void main(String[] args) {
		Redmi redmi=new Redmi();
		redmi.explode();
		redmi.os();
		Samsung samsung =new Samsung();
		samsung.TouchScreen();
		String a = "black";
		String b ="blue";
		int c=0000;
		Mobile mobile =new Mobile();
		mobile.colorsAvailable(a, b);
		mobile.colorsAvailable(a, c);
		samsung.colorsAvailable();
		mobile.colorsAvailable("Maha");
		
	}
}
