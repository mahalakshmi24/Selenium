package day5.classroom;

public class Mobile {
public void TouchScreen()
{
	System.out.println("TouchScreen Phone");
}

public void os()
{
	System.out.println("Android phone");
}

public void colorsAvailable(String a, String b)
{
System.out.println("It has 2 colors");	
System.out.println(a  + b);

}

public void colorsAvailable()
{
	System.out.println("nocolors");
}

public void colorsAvailable(String a, int b)
{
	System.out.println(b+ " " + a);
}

public void colorsAvailable(String who)
{
	if(who=="Maha")
	{
	System.out.println("blue");
	}
	else
		System.out.println("nothing");
}


}

