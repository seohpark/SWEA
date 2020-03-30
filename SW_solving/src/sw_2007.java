import java.util.Scanner;

public class sw_2007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			String str = sc.next();
			
			int k = 0;
			int j = 1;
			for(j=1; j<str.length(); j++) {
				if(str.charAt(j) == str.charAt(k)) {
					k++;
				}else {
					k = 0;
				}
			}
			System.out.printf("#%d %d\n", i, j-k);
					
		}
	}
}
