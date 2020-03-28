import java.util.Scanner;

public class sw_2043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int password = sc.nextInt();
		int startNum = sc.nextInt();
		int tryNum = 0;
		while(true) {
			if(password == startNum) {
				tryNum++;
				break;
			}else {
				startNum++;
				tryNum++;
			}
		}
		System.out.println(tryNum);
	}

}
/* Best answer
	System.out.println(P-K+1);		//Password가 startNum보다 크다고 가정하므로 식성립
*/