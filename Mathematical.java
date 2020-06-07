package demo;

public class Mathematical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math.max(10, 20);
		Math.sqrt(64);
		double a = Math.max(10,20) + Math.sqrt(81);
		double b = a + Math.max(Math.sqrt(64), Math.sqrt(81));
		System.out.println(b);
	}

}
