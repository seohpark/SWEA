import java.util.Scanner;

public class sw_1976 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int hour1, hour2, hour3;
		int min1, min2, min3;
		
		for(int i=1; i<=T; i++) {
			hour1 = sc.nextInt();
			min1 = sc.nextInt();
			hour2 = sc.nextInt();
			min2 = sc.nextInt();
			hour3 = hour1+hour2;
			min3 = min1+min2;
			// 시간 오류
			if(hour3>12) 
				hour3 -= 12;
			if(min1+min2>=60) {
				hour3++;
				min3 -= 60;
			}
			System.out.printf("#%d %d %d\n", i, hour3, min3);
		}
	}
}
