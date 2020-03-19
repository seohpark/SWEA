import java.util.Scanner;

public class sw_2070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		// 테스트 케이스 개수
		for(int i=0; i<T; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(num1 > num2) {
				System.out.println("#" + (i+1) + " >");
			}else if(num1 == num2) {
				System.out.println("#" + (i+1) + " =");
			}else
				System.out.println("#" + (i+1) + " <");
			 
			//System.out.println("#"+(i+1)+" "+(num1==num2?"=":num1<num2?"<":">"));  best 정답
			}
	}
}
