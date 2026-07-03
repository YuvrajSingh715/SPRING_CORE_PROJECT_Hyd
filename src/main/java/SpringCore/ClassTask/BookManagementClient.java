package SpringCore.ClassTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class BookManagement {

	private int bookId;
	private String bookName;
	private String authorName;
	private int price;

	public BookManagement() {
		System.out.println("Book Details Initialization by Setter Injection");
	}

	public BookManagement(int bookId, String bookName, String authorName, int price) {
		System.out.println("Book Details Initialization by Constructor Injection");
		this.authorName = authorName;
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showBookDetails() {
		System.out.println("==============");
		System.out.println("|Book Details|");
		System.out.println("==============");
		System.out.println("Book Id: " + bookId);
		System.out.println("Book Name: " + bookName);
		System.out.println("Author Name: " + authorName);
		System.out.println("Book Price: " + price);
	}

}

public class BookManagementClient {

	public static void main(String[] args) {
		
	ApplicationContext ac = new ClassPathXmlApplicationContext("SpringCore/config/application-context.xml");
	BookManagement bookManagement = ac.getBean("bookDetails", BookManagement.class);
	bookManagement.showBookDetails();
	
	}

}
