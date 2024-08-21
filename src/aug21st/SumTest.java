package aug21st;

public class SumTest {

	public static void main(String[] args) {
		
		Sum obj1=new Sum();
		obj1.add(10, 20);
		obj1.add(10.22, 20.33);
		obj1.add(3300022000L, 2200033000L);
		obj1.add(10, 20, 30);
		
		obj1.add(10, 20, 30,10, 20, 30);

	}

}
