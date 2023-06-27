package phase1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\WORK FOLDER\\Raheem-Sk\\JAVA-FSD-P1\\src\\phase1\\tempo.txt");

		if(file.exists()) {
			System.out.println("File already Exists");
		}
		else {
			file.createNewFile();
			System.out.println("File created Successfully");
		}
	
	// write	
		FileWriter fw = new FileWriter(file); 
		fw.write("ABCDEF");
		//fw.append(" asdfghjklqwertyuiopzxcvbnm ");
		fw .close();
		
		
	//read
		FileReader fr = new FileReader(file);
		while(fr.read()!=-1)
			System.out.println((char)fr.read());
		
	}
	
	
	
	
	
}
