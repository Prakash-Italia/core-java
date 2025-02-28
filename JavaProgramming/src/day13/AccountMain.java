package day13;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
	    acc.setAccno(10101);
	    acc.setName("John");
	    acc.setAmount(1253.25);
	    
	    System.out.println(acc.getAccno());
	    System.out.println(acc.getAmount());
	    System.out.println(acc.getName());
	}

}
