package pra;

public class q3b {
	public static void main(String[] args) {
		int x=10;
		int y=2;
		try {
			for(int z=2; z>=0; z--) {
				int ans = x/z;
				
				System.out.println(ans+ " ");
			}
		} catch (ArithmeticException e1) {
			System.out.println("E1");
		} catch(Exception e1) {
			System.out.println("E2"); 
		}
	}
}
