package Tak5_11_11_25;

public class Library {
	public void addBook(Book b) {
		System.out.println("Book added : "+b.title+"  by "+b.author);
	}
	public static void main(String[] args) {
		Book b=new Book();
		b.title="Trust Your Self";
		b.author ="Surekha";
		Library lib=new Library();
		lib.addBook(b);
		
	}

}
