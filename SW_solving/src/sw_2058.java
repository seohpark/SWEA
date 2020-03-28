import java.util.Scanner;

public class sw_2058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	int sum=0;
	for(int i=0; i<4; i++) {
		int last = N%10;
		N = N/10;
		sum += last;
		if(N < 10) {
		sum += N;
		break;
		}
	}	
	System.out.println(sum);
	}
}
