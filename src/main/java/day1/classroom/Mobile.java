package day1.classroom;

public class Mobile {
	
	public void makeCall(long number) {
		System.out.println("the number called is " +number);
		//return number;
	}
	public String sendSms(String text) {
		System.out.println("message sent is "+text);
		return text;
	}
	public boolean shutDown()
	{
		System.out.println("phone is switched off");
		return true;
			}
	public static void main(String[] args) {
	
		Mobile action = new Mobile();
		long num=9566173948L;
		action.makeCall(num);
		String sendSms = action.sendSms("hello");
		System.out.println("stored in variable sendSms " +sendSms);
		boolean shutDown = action.shutDown();
		System.out.println(shutDown);
	}
}
