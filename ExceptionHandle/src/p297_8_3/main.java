package p297_8_3;

public class main {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3); // 여기까지는 정상이므로 실행
			System.out.println(0/0); // 고의 에러 발생, 밑의 4까지 진행 안되고 여기서 끝
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
			}
		System.out.println(6);
	}
}
