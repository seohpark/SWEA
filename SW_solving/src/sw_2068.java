import java.util.Scanner;

public class sw_2068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] num = new int[10];
		int max = 0;
		
		for(int i=0; i<T; i++) {
			max = num[0];
			for(int j=0; j<10; j++) {				
				num[j] = sc.nextInt();				
				if(num[j] > max) {
					max = num[j];
				}
			}
			System.out.println("#"+(i+1)+" "+max);
		}
	}
}
