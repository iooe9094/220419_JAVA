package p267_7_10;

public class Tank extends Unit {

	@Override
	void move(int x, int y) {
			System.out.println("Tank[x=" + x + ",y=" + y + "]");
		}
	void cahngeMode() {
		System.out.println("공격 모드를 변환한다.");
	}
	}

