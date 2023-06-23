package practiceAssisted;

import java.io.*;
import java.io.IOException;

public class FileCURD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 File file = new File("Newfile.txt");
			 try {
			 if (file.createNewFile()) {
			 System.out.println("File created successfully.");
			 } else {
			 System.out.println("File already exists.");
			 }
			 } catch (IOException e) {
			 System.out.println("An error occurred while creating the file.");
			 e.printStackTrace();
			 }
	}

}
