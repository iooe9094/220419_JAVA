package p320_ex8_7;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; // 사용자 입력 저장 공간
		int count = 0; // 시도 횟수 카운트 변수
		
		do {
			count++;
			System.out.println("1과 100 사이의 값을 입력하세요.");
			
			try {
				input = new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
				continue; // continue 없으면 아래의 조건이 실행되므로 위로 다시 올려야함
			}
			
			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 " + count + "번 입니다.");
				break;
			}
		} while (true);
	}
}
