package p298_8_4;

public class main {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0); // 고의 에러 발생, 출력 x
			System.out.println(4); // 위 0/0 에러이므로 출력 x
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				System.out.println("true");
			} 
				System.out.println("ArithmeticException");
			} catch (Exception e) { // Exception e는 ArithmeticException(수학적에러) 외의 모든 것이 예외처리
				System.out.println("Exception");
			}
			System.out.println(6);
		}
	}

