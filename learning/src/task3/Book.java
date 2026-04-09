package task3;

public class Book {

		String bookTitle="The way to grow";
		String author="surekha";
		int isbn=45;
		public void addBookdetails( String bTitle,String Author, int isbN) {
			bookTitle=bTitle;
			author=Author;
			isbn=isbN;
			System.out.println(bookTitle);
			System.out.println(author);
			System.out.println(isbN);
				
		}
		public String displayDetails() {
			return "title : "+bookTitle+"  Authorname : " + author+"   isbn: "+isbn;
			
		}
		

		public static void main(String[] args) {
			Book obj=new Book();
			obj.addBookdetails("trust your self", "rekha", 34);
			String res=obj.displayDetails();
			System.out.println(res);
			

		}

	}



