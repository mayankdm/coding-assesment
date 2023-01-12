package java.training.assesments.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Book1", new Author("author1","female", 32), 500, 1067.45, 1));
		books.add(new Book("Book2", new Author("author2","male", 40), 432, 106.00, 2));
		books.add(new Book("Book3", new Author("author1","female", 32), 219, 67.00, 3));
		books.add(new Book("Book4", new Author("author3","male", 24), 557, 192.50, 4));
		books.add(new Book("Book5", new Author("author4","male", 51), 301, 1003.45, 5));
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Select index to get book details!");
		for(Book book: books) {
			System.out.print("Index: ");
			System.out.print(book.getBookNumber());
		}
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println(books.stream().filter(book -> book.getBookNumber() == 1));
			break;
		case 2:
			System.out.println(books.stream().filter(book -> book.getBookNumber() == 2));
			break;
		case 3:
			System.out.println(books.stream().filter(book -> book.getBookNumber() == 3));
			break;
		case 4:
			System.out.println(books.stream().filter(book -> book.getBookNumber() == 4));
			break;
		case 5:
			System.out.println(books.stream().filter(book -> book.getBookNumber() == 5));
			break;

		default:
			System.out.println("book not found!");
			break;
		}
	}
}
