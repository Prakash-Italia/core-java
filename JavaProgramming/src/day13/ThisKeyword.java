package day13;

public class ThisKeyword {
		
	int x, y;	//class variables/instance variables
	
	void setData(int x, int y)	// a,b are local variables
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x+"  "+y);
	}
	public static void main(String[] args) {

			ThisKeyword th = new ThisKeyword();
			th.setData(10, 20);
			th.display();

	}

}
