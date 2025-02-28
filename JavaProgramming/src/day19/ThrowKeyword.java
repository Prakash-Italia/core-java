package day19;

public class ThrowKeyword {
	
	void checksum(int num)
	{
		if(num<1)
		{
			throw new ArithmeticException("Number is negitive, cannot calculate squre.");
		}
		else
		{
			System.out.println(num*num);
		}
	}
	public static void main (String[] args) {
		ThrowKeyword tk=new ThrowKeyword();
		try
		{
		tk.checksum(-1);
		}
		catch(ArithmeticException e)
		{
			System.out.println("data is not valid.");
		}
	}
	
}
