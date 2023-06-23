package Handler;

import java.io.*;
import java.util.Scanner;

public class FilesExp1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int Choice ;
		System.out.println("File Operations:\n1.Create\n2.Update\n3.Read\n4.Delete\n5.Exit");
		Choice = sc.nextInt();
		
		switch (Choice) 
		{
		case 1 :
			try {
			      File myObj = new File("filename.txt");
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			break;
		case 2 :
			try {
			      FileWriter myWriter = new FileWriter("C:\\WORK FOLDER\\Raheem-Sk\\JAVA-FSD\\file2.txt");
			      myWriter.write("Handling a file with try catch and java and switch case");
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    }
				catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			break;
		case 3:
			try {
				System.out.println("contents of file are");
			      File myObj = new File("C:\\WORK FOLDER\\Raheem-Sk\\JAVA-FSD\\file2.txt");
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(data);
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			break;
		case 4 :
			File myObj = new File("C:\\WORK FOLDER\\Raheem-Sk\\JAVA-FSD\\file2.txt"); 
			myObj.delete();
		    if (myObj.exists())
		    {	      System.out.println("Deleted the file: " + myObj.getName());
		    }
		    else 
		    	System.out.println("Failed to delete the file.");
			break;
		case 5 :
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + Choice);
		}

		}
		
		
		
	}







/*try {
			/// created a file 
			FileWriter F = new FileWriter("file1.txt");
			/// file writing
			try {
				FileOutputStream fo = new FileOutputStream("C:\\WORK FOLDER\\Raheem-Sk\\JAVA-FSD\\file1.txt");
				
				System.out.println("Enter data\n");
				String s = sc.nextLine();
	            byte b[]=s.getBytes(); //converting string into byte array 
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
		*/
/*/*ystem.out.println("Enter the file name to create \n");
			String S = sc.next();
			File f = new File(S);
			System.out.println(S+" created successfully*/
