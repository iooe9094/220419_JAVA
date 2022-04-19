package p298_8_5;

public class main {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0); // 고의 수학적 에러 발생, 출력 x
			System.out.println(4); // 위 0/0 에러이므로 출력 x
		} catch (ArithmeticException ae) {
			    ae.printStackTrace(); // 예외발생 당시의 호출스택에 있던 메서드의 정보와 예외 메세지를 화면에 출력
				System.out.println("예외메세지 : " + ae.getMessage()); // 발생한 예외클래스의 인스턴스에 저장된 메세지를 얻음
			} 
			System.out.println(6);
		}
	}

