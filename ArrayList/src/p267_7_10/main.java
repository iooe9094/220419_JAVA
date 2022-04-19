package p267_7_10;

public class main {

	public static void main(String[] args) {
		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		
		for (int i=0; i<group.length; i++) {
			group[i].move(100, 200);
		}

	}

}
