package practiceAssisted;

import java.io.*;
import java.util.Scanner;

public class FilesExp1 {

	public static void main(String[] args) {
		
		try {
			/// created a file 
			FileWriter F = new FileWriter("file1.txt");
			/// file writing
			try {
				FileOutputStream fo = new FileOutputStream("C:\\WORK FOLDER\\Raheem-Sk\\JAVA-FSD\\file1.txt");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter data\n");
				String s = sc.nextLine();
				
	            byte b[]=s.getBytes();//converting string into byte array 
				
				fo.write(b);

			}
			catch(Exception e) {
				F.close();
			}
			System.out.println("Written succesfully");
			
		}
		catch(IOException i) {
			System.out.println("Caught io ");
		}
	}
}