package com.annotation.classtaskD18;

@BookInfo(title = "Stranger Things", author = "The Duffer Brothers", price = 1499.99)

public class Book {

	public static void main(String[] args) {

		Class<Book> ref = Book.class;

		BookInfo info = ref.getAnnotation(BookInfo.class);

		System.out.println(info);
		System.out.println("===============================");

		System.out.println("Book Title: " + info.title());
		System.out.println("Book Author: " + info.author());
		System.out.println("Book Price: " + info.price());

	}

}
