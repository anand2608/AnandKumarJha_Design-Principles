package calculator;
import java.util.Scanner;
public class Checker {
	Scanner sc=new Scanner(System.in);
	public void TestAdd()
	{
		
		System.out.println("Enter two numbers");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		Addition ad=new Addition();
		ad.Add(a,b);

	}
	public void TestSub()
	{
		
		System.out.println("Enter two numbers");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		Subtraction s=new Subtraction();
		s.Sub(a,b);

	}
	public void TestMul()
	{
		
		System.out.println("Enter two numbers");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		Multiplication mul =new Multiplication();
		mul.Mul(a,b);

	}
	public void TestDiv()
	{
		
		System.out.println("Enter two numbers");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		Division d=new Division();
		d.Div(a,b);

	}


}
