package week3.assignments;

public class Desktop implements HardWare, SoftWare{

	@Override
	public Void SoftWareResources() {
		// TODO Auto-generated method stub
//		return null;
		System.out.println("implemented from software interface");
		return null;
	}

	@Override
	public void HardWareResources() {
		// TODO Auto-generated method stub
		System.out.println("implemented from harware interface");
		
	}
	
	public void DesktopModel(String a)
	{

		System.out.println("own menthod " +a);
	}

	public static void main(String[] args) {
		String model = "latest model";
		Desktop desktop= new Desktop();
		desktop.HardWareResources();
		desktop.SoftWareResources();
		desktop.DesktopModel(model);
				
		
	}
}
