package p301_8_6;

public class main {

	public static void main(String[] args) {
		try {
//			Exception e = new Exception("고의로 발생시켰음");
//			throw e; // 예외 발생시키는 키워드 : throw
			throw new Exception("고의로 발생시켰음"); // 위의 두 줄 한 줄로 표현 가능
		} catch (Exception e) {
			System.out.println("에러메세지 = " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음");
	}

}
