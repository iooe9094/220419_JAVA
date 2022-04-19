package p296_8_1;

public class main {

	public static void main(String[] args) {
		System.out.println(1);
		try { // try-catch 시작
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
		} // try-catch 종료
		System.out.println(5);
	}
}
