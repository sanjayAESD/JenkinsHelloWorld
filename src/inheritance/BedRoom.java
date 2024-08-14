package inheritance;

public class BedRoom extends Room {
	
	int i;

	BedRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	void disp() {
		
	super.i = 10;
		i = 20;
		
		System.out.println("The value of i is " + super.i);
		System.out.println("The value of i is " + i);
	}
}
