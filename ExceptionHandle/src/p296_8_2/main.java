package p296_8_2;

public class main {

	public static void main(String[] args) {
		System.out.println(1);
		try { // try-catch 시작
			System.out.println(0/0); // 고의로 에러 발생, 하단의 2까지 진행 안되고 여기서 멈춤
			System.out.println(2); // 실행 x
		} catch (ArithmeticException ae) {
			System.out.println(3); // try부분 에러 발생으로 catch의 내용 출력, 수학 관련 에러 처리
		} // try-catch 끝
		System.out.println(4);
	}

}
