package day11;

public class studentMain {

	public static void main(String[] args) {
		//Student stu=new Student();
		
		//(1)assign data using object reference
		/*stu.sid=101;
		stu.sname="John";
		stu.grade='A';
		stu.printStuData();*/
		
		//(2) Assign data by using user defined method
		
		//stu.setStuData(101, "Prakash", 'B');
		//stu.printStuData();
		
		//(3) using construction
		
		Student stu=new Student(101, "Prakash", 'C');
		stu.printStuData();
	}

}
