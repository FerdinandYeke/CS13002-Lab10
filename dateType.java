package Lab10;

public class dateType {
	
	private int Month;
	private int Day;
	private int Year;
	
	public dateType(int Month, int Day, int Year) 
	{
		this.Month = 11;
		this.Day = 10;
		this.Year = 2022;
	}
	
	//Setters
	public void setDate(int Month, int Day, int Year)
	{
		this.Month = Month;
		this.Day = Day;
		this.Year = Year;

	}
	//Getters
	public final int getDay()
	{
		return Day;
	}
	
	public final int getMonth()
	{
		return Month;
	}
	
	public final int getYear()
	{
		return Year;
	}
	
	
	
	public final void printDate() 
	{
		System.out.println(Month+"/"+Day+"/"+Year);
	}
	
	//Main method starts here
	public static void main(String []args)
	{
		dateType Y1 = new dateType(11,10,2022);
		
		Y1.setDate(11, 10, 2022);
		
		Y1.printDate();
	}
	
}
