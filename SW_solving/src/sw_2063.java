
import java.util.Arrays;
import java.util.Scanner;

public class sw_2063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N];
	
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println(num[N/2]);
	}
}
