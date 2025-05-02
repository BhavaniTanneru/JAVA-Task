/*package methods;
import java.util.Scanner;
public class Statictask {
	public static void square(Scanner sc) {
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int result=num*num;
		System.out.println("Square Of The Number Is:"+result);
	}
	public static void simpleinterest(Scanner sc) {
		System.out.println("Enter Number For P:");
		int P=sc.nextInt();
		System.out.println("Enter Number For T:");
		int T=sc.nextInt();
		System.out.println("Enter Number For R:");
		int R=sc.nextInt();
		double result=P*T*R/100;
		System.out.println("Simple Interest:"+result);
	}
	public static void fahrenheit(Scanner sc) {
		System.out.println("Enter Number For C:");
		int C=sc.nextInt();
		int F=(C*9/5)+32;
		System.out.println(" Fahrenheit Conversion"+F);
	}
	public static void celsius(Scanner sc) {
		System.out.println("Enter Number For C:");
		int C=sc.nextInt();
		double F=(C-32)*5/9;
		System.out.println("Fahrenheit to Celsius Conversion\r\n"+F);
	}
	public static void averages(Scanner sc){
		System.out.println("Enter Number 3 Numbers:");
		double A=sc.nextInt();
		double B=sc.nextInt();
		double C=sc.nextInt();
		double result=(A+B+C)/3;
		System.out.println("Average Of Three Numbers Is:"+result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		square(sc);//Calling Directly
		Statictask.simpleinterest(sc);//Calling By Class Name
		fahrenheit(sc);
		Statictask.celsius(sc);
		averages(sc);
	}

}*/
package methods;
public class Statictask {
	public static void square(int num) {
		int result=num*num;
		System.out.println("Square Of The Number Is:"+result);
	}
	public static void simpleinterest(double P,double T,double R) {
		Double SI=P*T*R/100;
		System.out.println("Simple Interest:"+SI);
	}
	public static void fahrenheit(double C) {
		double F=(C*9/5)+32;
		System.out.println(" Fahrenheit Conversion"+F);
	}
	public static void celsius(double C) { 
		double F=(C*9/5)+32;
		System.out.println(" Fahrenheit Conversion"+F);
	}
	public static void averages(int A,int B,int C){
		double result=(A+B+C)/3;
		System.out.println("Average Of Three Numbers Is:"+result);
	}
    public static void main(String[] args) {
	square(10);//Calling Directly
	Statictask.simpleinterest(1,2,3);//Calling By Class Name
	fahrenheit(78);
	Statictask.celsius(67);
	averages(2,3,4);
}
}

