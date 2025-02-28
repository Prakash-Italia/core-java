package day19;

public class MultipleCatchBlocks {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		System.out.println("Program is started..");
		String s=null;
		
		try
		{
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception handeled..");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program is completed..");
	}

}
