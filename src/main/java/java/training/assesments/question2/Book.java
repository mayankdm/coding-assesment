package java.training.assesments.question2;

public class Book {
	private String bookId;
	private String bookName;
	private Author author;
	private Integer pages;
	private Double price;
	private Integer bookNumber;

	public Book() {
		super();
	}

	public Book(String bookName, Author author, Integer pages, Double price, Integer bookNumber) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.pages = pages;
		this.price = price;
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(Integer bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookId() {
		return bookId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", pages=" + pages
				+ ", price=" + price + ", bookNumber=" + bookNumber + "]";
	}
}
