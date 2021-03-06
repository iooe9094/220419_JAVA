package ex01;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student(1001, "Lee");
		Student kim = new Student(2001, "Kim");
		
		// lee 과목, 점수 추가 : 향상된 배열
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 50);
		
		// kim 과목, 점수 추가 : 향상된 배열
		kim.addSubject("국어", 70);
		kim.addSubject("수학", 85);
		kim.addSubject("영어", 100);
		
		// 각 학생의 과목 정보와 총점을 출력
		lee.showStudentInfo();
		System.out.println();
		kim.showStudentInfo();
	}

}
