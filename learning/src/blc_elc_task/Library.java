package blc_elc_task;

public class Library {

	public static void main(String[] args) {
	Book b1= new Book();
	Book b2=new Book();
	b1.setBookId(101);
	b1.setTitle("The way to Success");
	b1.setAuthor("Surekha");
	b1.setPrice(1000);
	b2.setBookId(102);
	b2.setTitle("Trust your self");
	b2.setAuthor("kalyani");
	b2.setPrice(1200);
	System.out.println("Book id:" +b1.getBookId());
	System.out.println("Book title :"+b1.getTitle());
	System.out.println("Book author :"+b1.getAuthor());
	System.out.println("Book price :"+b1.getPrice());
	System.out.println("__________________");
	System.out.println("Book id:" +b2.getBookId());
	System.out.println("Book title :"+b2.getTitle());
	System.out.println("Book author :"+b2.getAuthor());
	System.out.println("Book price :"+b2.getPrice());

	}

}
