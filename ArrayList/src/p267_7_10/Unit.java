package p267_7_10;

public abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("현재 위치 정지");
	}
}
