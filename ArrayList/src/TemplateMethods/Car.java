package TemplateMethods;

public abstract class Car {
	
	// 2. 차 운행 시작 메소드
	public abstract void drive();
	
	// 3. 차 운행 종료 메소드
	public abstract void stop();
	
	// 1. 차 시동 켜기 메소드
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	// 4. 차 시동 끄기 메소드
	public void endCar() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메소드
	// 변수에 final 붙으면 상수
	// 메소드에 final 붙으면 override 못하게 막음
	final public void run() {
	    startCar(); // fixed
	    drive(); // override
	    stop(); // override
	    endCar();// fixed
	}
}
