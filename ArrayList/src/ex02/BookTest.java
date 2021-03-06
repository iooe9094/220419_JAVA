package ex02;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		
		// 향상된 반복문을 이용한 방법
		ArrayList<Book> book = new ArrayList<>();

		// ArrayList 값 저장
		book.add(new Book("태백산맥", "조정래"));
		book.add(new Book("데미안", "헤르만헷세"));
		book.add(new Book("어떻게 살 것인가?", "유시민"));
		book.add(new Book("토지", "박경리"));
		book.add(new Book("어린왕자", "생택쥐페리"));
		
		// 일반 for문
		for (int i=0; i<book.size(); i++) {
			Book b = book.get(i);
			b.showBookInfo();
		}
		System.out.println("------------------------------");
		// 향상된 for문
		for (Book b : book) {
			b.showBookInfo();
		}
		
//		// 일반적인 반복문을 통한 방법
//		// 배열의 선언 : 공간만 생성함
//		Book[] book = new Book[5];
//		
//		// 생성된 공간에 실질적인 값을 저장해야함
//		book[0] = new Book("태백산맥", "조정래");
//		book[1] = new Book("데미안", "헤르만헷세");
//		book[2] = new Book("어떻게 살 것인가?", "유시민");
//		book[3] = new Book("토지", "박경리");
//		book[4] = new Book("어린왕자", "생택쥐페리");
//		
//		// 배열의 값 반복문 통해 출력
//		for (int i=0; i<book.length; i++) {
//			System.out.println(book[i].getAuthor() + " 작가의 " + book[i].getBookName());
//		}

	}

}
