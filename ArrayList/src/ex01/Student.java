package ex01;

import java.util.ArrayList;

public class Student {
	
	int StudentID;
	String StudentName;
	ArrayList<Subject> subjectList; // ArrayList는 command+shift+o로 import
	
	// 매개변수 2개 생성자
	public Student(int studentID, String studentName) {
		
		StudentID = studentID;
		this.StudentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	// 과목을 저장할 메소드
	public void addSubject(String x, int y) {
		Subject subject = new Subject();
		
		// 과목에 정보를 저장하는 로직 필요
	    subject.setName(x); // 위의 매개변수 x를 과목 객체에 저장
	    subject.setScorePoint(y); // 위의 매개변수 y를 과목 객체에 저장
		
		this.subjectList.add(subject); // 향상된 배열(ArrayList)에 과목 정보 추가
	}
	
	public void showStudentInfo() {
		// 향상된 배열을 반복문을 통해 정보를 꺼내어 출력
		int total = 0;
		
		for(Subject s : subjectList) {
		    total += s.getScorePoint();
			// 1. print로 출력 : "학생" + studentName + "의 과목이름은 " + name +
			//                 "과목성적은 " + scorePoint + "입니다."
			System.out.println("학생" + StudentName + "의 과목이름은 " + s.getName() +
					           "이고, 과목성적은 " + s.getScorePoint() + "점 입니다.");
		}
		// 2. 과목의 점수를 모두 더해서 총점을 출력
		System.out.println("총점은 = " + total + "점 입니다.");
	}
}
