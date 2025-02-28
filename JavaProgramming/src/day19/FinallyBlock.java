package day19;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String s="Welcome";
		try
		{
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception handeled..");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally block excecuted..");
		}
	}

}
