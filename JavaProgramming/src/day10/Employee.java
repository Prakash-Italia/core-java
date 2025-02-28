package day10;

public class Employee {
	
	int id;
	String name;
	String job;
	int sal;
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
	}
	
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.id=101;
		emp1.name="John";
		emp1.job="Manager";
		emp1.sal=50000;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.id=102;
		emp2.name="David";
		emp2.job="Superviser";
		emp2.sal=40000;
		emp2.display();
				
	}

}
