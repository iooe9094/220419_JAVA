package ex02;


public class Book {
	
	private String BookName;
	private String author;
	
	// 출력메소드
	public void showBookInfo() {
		System.out.println(BookName + " " + author);
	}

	// getter & setter
	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// 생성자(기본)
	public Book() {
		
	}

	// 생성자(매개변수)
	public Book(String bookName, String author) {
		BookName = bookName;
		this.author = author;
	}
}
