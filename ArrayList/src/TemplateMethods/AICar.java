package TemplateMethods;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행 시작");
		System.out.println("자동차가 스스로 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자율 주행 종료");
	}

}
