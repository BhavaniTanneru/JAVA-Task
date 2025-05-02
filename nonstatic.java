package methods;
import java.util.Scanner;
public class nonstatic {
	public void addition(Scanner sc) {
		System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
		System.out.println("Addition Of a+b is:"+(a+b));
	}
	public void subtraction(Scanner sc) {
		System.out.println("Enter two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
		System.out.println("Subtraction of a-b is:"+(a-b));
	}
	public void multiply(Scanner sc) {
		System.out.println("Enter two numbers:");
        double a = sc.nextDouble();
        int b = sc.nextInt();
		System.out.println("Multiplication of a*b is:"+a*b);
	}
	public void division(Scanner sc) {
		System.out.println("Enter two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
		if(b>0) {
		   System.out.println("Division of a/b is:"+(a/b));
		}
	    else
			System.out.println("b is always Gretaer Than 0");
	}
	public void modulus(Scanner sc) {
		System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
		if(b>0) {
		System.out.println("Modulus of a%b is:"+(a%b));
		}
		else {
			System.out.println("Denominator Coudnt take 0");
		}
	}
	public static void main(String[] args) {
		nonstatic task=new nonstatic();
		Scanner sc=new Scanner(System.in);
		task.addition(sc);
		task.subtraction(sc);
		task.multiply(sc);
		task.division(sc);
		task.modulus(sc);
	}

}
