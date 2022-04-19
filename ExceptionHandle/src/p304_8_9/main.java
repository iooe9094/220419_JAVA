package p304_8_9;

public class main {

	 // throws Exception 있으면 해당 내용에서는 예외처리 안하겠다는 의미
	public static void main(String[] args) throws Exception { 
		method1();
	}
	
	static void method1() throws Exception {
		method2();
	}

	static void method2() throws Exception {
		throw new Exception(); // 예외 강제 발생, 하단의 2줄을 1줄로 만든 것
		// Exception e = new Exception();
		// throw e 
	}
	// 3건 모두 예외처리를 하지 않기 때문에 실행시키면 에러가 발생함
	// 이를 해결하기 위해 해결할 곳에서 try-catch로 해줘야 에러 제거
}
