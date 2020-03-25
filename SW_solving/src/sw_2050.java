import java.util.Scanner;

public class sw_2050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			System.out.printf("%d ",(int)str.charAt(i) -64);
			/* ¶Ç´Â
			 int num = (int)str.charAt(i);
			 System.out.printf("%d ", num-64 );
			*/
		}		
	}
}
