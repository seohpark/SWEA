import java.util.Scanner;

public class sw_2071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=1; i<=testCase; i++) {
			double sum =0;
			for(int j=0; j<10; j++) {
				int num = sc.nextInt();
				sum += num;
			}
			System.out.println("#" + (i) + " " +Math.round(sum/10));
		}	
	}
}
