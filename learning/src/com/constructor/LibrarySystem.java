package com.constructor;

public class LibrarySystem {

	public static void main(String[] args) {
     Book b1=new Book(101, "the way to success",5);
     System.out.println("Book details :");
     System.out.println("====================");
     System.out.println(b1.getBookId());
     System.out.println(b1.getTitle());
     System.out.println(b1.getAvailablecopies());
     System.out.println();
     for(int i=1;i<=10;i++) {
    	 if(i<=3) {
    		 System.out.println("attempting barrow book....");
    		 b1.borrowBook();
    	 }
    	 else {
    		 System.out.println("Attempting to a return a book");
    		 b1.returnBook();
    	 }
     }

	}

}
