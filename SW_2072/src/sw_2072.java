import java.util.Scanner;

/*
   ����ϴ� Ŭ�������� Solution �̾�� �ϹǷ�, ������ Solution.java �� ����� ���� �����մϴ�.
   �̷��� ��Ȳ������ �����ϰ� java Solution ������� ���α׷��� �����غ� �� �ֽ��ϴ�.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();				// �׽�Ʈ���̽��� ����
	
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