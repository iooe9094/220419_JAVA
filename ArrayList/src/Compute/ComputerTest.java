package Compute;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer c1 = new DeskTop();
		Computer c2 = new LapTop();
		Computer c3 = new WorkStation();
		
		c1.display(); // "DeskTop Computer"
		c1.typing(); // "DeskTop Typing"
		
		c2.display();
		c2.typing();
		
		c3.display();
		c3.typing();

	}

}
