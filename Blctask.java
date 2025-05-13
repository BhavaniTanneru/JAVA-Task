package methods;
public class Blctask {
		int bookId;
		String author;
		String title;
		double price;
		int pages;
	public void setBookDetails(int a,String b,String c,double d,int e) {
		bookId=a;
		author=b;
		title=c;
		price=d;
		pages=e;
	}
	public void displayBookDetails() {
		System.out.println("bookId : "+bookId);
		System.out.println("author : "+author);
		System.out.println("title : "+title);
		System.out.println("price : "+price);
		System.out.println("pages : "+pages);
	}
}
