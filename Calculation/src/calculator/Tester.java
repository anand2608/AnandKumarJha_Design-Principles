package calculator;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Checker c=new Checker();
		Scanner sc = new Scanner(System.in);
		System.out.println("The menu is");
		System.out.println("1.Addition");

		System.out.println("2.Subtraction");

		System.out.println("3.Multiplicaation");
		System.out.println("4.Division");
		System.out.println("Enter the choice");
		choice = sc.nextInt();
		switch (choice) {
		
		case 1:
			c.TestAdd();
			break;
		case 2:
			c.TestSub();
			break;
		case 3:
			c.TestMul();
			break;
		case 4:
			c.TestDiv();
			break;
		default:
			System.out.println("Invalid choice Thank you");

		}
		sc.close();
	}

}
