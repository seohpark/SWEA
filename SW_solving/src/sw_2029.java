import java.util.Scanner;

public class sw_2029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		
		for(int i=1; i<=T; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int quotient = num1/num2;
			int remainder = num1%num2;
			System.out.printf("#%d %d %d\n", i, quotient, remainder);
		}
		
	}

}
/* Best answer 
	for(int i=1; i<=T; i++) {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.printf("#%d %d %d\n", i, a/b, a%b);
*/
