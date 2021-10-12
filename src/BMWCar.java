
public class BMWCar extends Fourwheeler {
	
	private int wheelcount;
	private String type;

	public BMWCar(int wheelcount, String type) {
		
		super(wheelcount, type);
		this.wheelcount=wheelcount;
		this.type=type;

	}
	
	@Override
	public void GeneralDetails()
	{
		super.GeneralDetails();
		System.out.println("This is BMW General details");
	}
	
	public void BMWDetails()
	{
		System.out.println("This is BMW"+wheelcount+"This is BMW"+type);
	}

 

}
