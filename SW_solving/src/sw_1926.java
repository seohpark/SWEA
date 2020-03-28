import java.util.Scanner;

public class sw_1926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		
		for(int j=1; j<=N; j++) {
			int num = 0;
			String str = Integer.toString(j);
			for(int i=0; i<str.length(); i++) {
				if('3' == str.charAt(i) || '6' == str.charAt(i) || '9' == str.charAt(i)) {
					num++;
				}
			}
			if(num == 1) {
				System.out.print("- ");
			}else if(num == 2) {
				System.out.print("--");
				System.out.print(" ");
			}
			else if(num == 3) {
				System.out.print("---");
				System.out.print(" ");
			}
			else {
				System.out.printf("%d ", j);
			}
		}
	}
}