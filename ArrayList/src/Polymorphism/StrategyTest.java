package Polymorphism;

public class StrategyTest {

	public static void main(String[] args) {
		
		Strategy strategy = null;
		Soldier rambo = new Soldier();
		
		// 총을 람보에게 전달해서 전투를 수행하게 만드는 부분
		// 다형성 형태 (의존성 주입 spring DI)
	    strategy = new StrategyGun(); // "탕, 타당, 타다당"
	    rambo.runContext(strategy); // 매개변수 껍데기는 부모로, 진짜는 자식으로 들어옴
	    System.out.println("----------------");
	    
	    // 검을 람보에게 전달해서 전투를 수행하게 만드는 부분
	    strategy = new StrategySword(); // "챙, 채챙, 채채챙"
	    rambo.runContext(strategy);
	    System.out.println("----------------");
	    
	    // 활을 람보에게 전달해서 전투를 수행하게 만드는 부분
	    strategy = new StrategyBow(); // "슝, 슈슝, 최종병기"
	    rambo.runContext(strategy);
	}

}
