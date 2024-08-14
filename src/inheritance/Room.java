package inheritance;

public class Room {
	
	
	int l,b;
	int i;
	
	Room(int x , int y){
		
		l = x;
		b = y;
		
	}

	
	

	void area() {
		
		int res;
		res = l*b;
		System.out.println("Area is " + res);
	}
	
	
}
