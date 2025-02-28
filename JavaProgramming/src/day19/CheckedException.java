package day19;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		System.out.println("Program is started...");
		
		System.out.println("Program is in progress..");
		
		FileInputStream file=new FileInputStream("C:\\new.txt");
		
		file.read();
		
		System.out.println("Program is completed..");
	}

}
