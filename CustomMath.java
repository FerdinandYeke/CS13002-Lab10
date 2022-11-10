package Lab10;
import java.util.Random;

public class CustomMath {

	public static double E = 2.718;
	public static double PI = 3.1415;
	private static Random randomNumberGenerator = new Random();
	
	
	private CustomMath() 
	{
		
	}
	
	public static int getRandomNumber()
	{
		int num = randomNumberGenerator.nextInt();
		return num;
	}
	
	public static int maxInt(int num, int num2)
	{
		if(num > num2)
		{
			return num;
		}
		
		else 
		{
			return num2;
		}
	}
	
	public static int maxLONG(int num, int num2)
	{
		if(num > num2)
		{
			return num;
		}
		
		else 
		{
			return num2;
		}
	}
	
	public static double sin(double num1) 
	{
		return Math.sin(num1);
		
	}
	
	public static double cos(double num1) 
	{
		return Math.cos(num1);
		
	}
	
	public static double tan(double num1) 
	{
		return Math.tan(num1);
		
	}
	
	public static double log(double num1) 
	{
		return Math.log(num1);
		
	}
	
	public static double floor(double num1) 
	{
		return Math.floor(num1);
		
	}
	
	public static double ceil(double num1)
	{
		return Math.ceil(num1);
	}
	
	public static double pow(double num1, double num2)
	{
		return Math.pow(num1, num2);
	}
	
	public static void main(String []args)
	{
		
		System.out.println(CustomMath.E);
		System.out.println(CustomMath.PI);
		System.out.println(CustomMath.ceil(10));
		System.out.println(CustomMath.cos(10));
		System.out.println(CustomMath.floor(13.3));
		System.out.println(CustomMath.getRandomNumber());
		System.out.println(CustomMath.log(10.3));
		System.out.println(CustomMath.maxInt(19, getRandomNumber()));
		System.out.println(CustomMath.maxLONG(getRandomNumber(), getRandomNumber()));
		System.out.println(CustomMath.pow(13, 3));
		System.out.println(CustomMath.sin(3));
		System.out.println(CustomMath.tan(3));
		System.out.println(CustomMath.tan(5));
	}
	
}
