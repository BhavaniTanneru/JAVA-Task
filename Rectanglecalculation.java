package methods;
public class Rectanglecalculation {
		public void calculateArea(int l,int b) {
			double area=l*b;
			System.out.println("Area Is:"+area);
		}
		public void calculatePerimeter(int l,int b) {
			double perimeter=(2*(l+b));
			System.out.println("Perimetr Is:"+perimeter);
		}
		public static void main(String[] args) {
			Rectanglecalculation nonstatic=new Rectanglecalculation();
			nonstatic.calculateArea(20,30);
			nonstatic.calculatePerimeter(2,3);
		}
	}
/*package methods;
import java.util.Scanner;
public class Rectanglecalculation {
public void calculateArea(Scanner sc) {
	System.out.println("Enter L:");
	int L=sc.nextInt();
	System.out.println("Enter B:");
	int B=sc.nextInt();
	double area=L*B;
	System.out.println("Area Is:"+area);
}
public void calculatePerimeter(Scanner sc) {
	System.out.println("Enter L:");
	int L=sc.nextInt();
	System.out.println("Enter B:");
	int B=sc.nextInt();
	double perimeter=(2*(L+B));
	System.out.println("Perimetr Is:"+perimeter);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Rectanglecalculation nonstatic=new Rectanglecalculation();
	nonstatic.calculateArea(sc);
	nonstatic.calculatePerimeter(sc);
}

}*/




