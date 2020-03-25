import java.util.Scanner;

public class sw_2056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // ¹Ýº¹È½¼ö

		for (int i = 0; i < T; i++) {
			String str = sc.next();
			int result =0;
			
			int year = Integer.parseInt(str.substring(0, 4));
			int month = Integer.parseInt(str.substring(4, 6));
			int day = Integer.parseInt(str.substring(6));
			if (1 <= month && month <= 12) {
				switch (month) {
				case 2:
					if (1 > day || day > 28) {
						result = -1;
					} 
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (1 > day || day > 31) {
						result = -1;
					} 
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (1 > day || day > 30) {
						result = -1;
					} 
					break;
				}
			}else { result = -1;}
			if(result == -1) {
				System.out.print("#" + (i+1) + " "+ result );
			}else {
				System.out.print("#" + (i+1) + " " );
				System.out.print(String.format("%04d", year));
				System.out.print("/" );
				System.out.print(String.format("%02d",  month));
				System.out.print("/");
				System.out.println(String.format("%02d", day));
			}
		}

		
	}
}
/* Best answer
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); 
		int str[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=0; i<T; i++) {
			int ymd = sc.nextInt();
			
			int year = ymd/10000;
			int month = (ymd-year*10000)/100;
			int day = ymd%100;
			
			if((month<1 || month>12) || (day<1 || day>str[month-1])) {
				System.out.printf("#%d -1\n", i+1);
			}else {
				System.out.printf("#%d %04d/%02d/%02d\n", i+1, year, month, day);
			}	
		}	
		*/
