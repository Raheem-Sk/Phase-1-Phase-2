package calc;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		System.out.println("|| Airthmetic Calculator ||");
		Scanner sc = new Scanner(System.in);
		double num1,num2; int choice;
		System.out.print("FirstNumber :");
		num1 = sc.nextInt();
		System.out.print("SecondNumber :");
		num2 = sc.nextInt();
		System.out.print("Select Operation : \n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Addition of Two numbers is :"+(num1+num2));
			break;
		case 2:
			System.out.println("Subtraction of Two numbers is :"+(num1-num2));
			break;
		case 3:
			System.out.println("Multiplication of Two numbers is :"+(num1*num2));
			break;
		case 4:
			System.out.println("Division of Two numbers is :"+(num1/num2));
			break;
		default:
			System.out.println("Incorrect Choice");
			break;

		}
	
	}
		
}
