import java.util.Scanner;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();				// 테스트케이스의 개수
	
        for(int test_case = 1; test_case <= T; test_case++){
        	int sum = 0;
        	for(int i=0; i<10; i++) {
        		int num = sc.nextInt();
        		if(num%2 != 0) {
        			sum += num;
        		}
        	}
        	System.out.println("#"+ test_case + " " +sum);
        	sum=0;
        }
	}
}