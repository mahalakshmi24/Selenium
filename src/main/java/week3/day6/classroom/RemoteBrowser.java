package week3.day6.classroom;

public class RemoteBrowser implements Browser{

	@Override
	public void locateElement() {
		
		System.out.println("Element located");
	}

	@Override
	public String getTitle(String a) {
		
		System.out.println(a);
		return a;
	}

	@Override
	public void close() {
		
		System.out.println("closed");
	}
	
	public static void main(String[] args) {
		
		String a= "Maha";
		RemoteBrowser browser= new RemoteBrowser();
		browser.locateElement();
		browser.close();
		browser.getTitle(a);
		
	}
	
	
	
	
}