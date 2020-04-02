import java.util.Scanner;

public class sw_2005 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         
        for(int i=0; i<T; i++) {
            int num = sc.nextInt();    
            int[][] arr = new int[num][num];
            System.out.printf("#%d\n", num);
             
            arr[0][0] = 1;
            System.out.println(arr[0][0]);
            for(int j=1; j<num; j++) {   
                System.out.printf("%d ", arr[0][0]);
                for(int k=1; k<=j; k++) {
                    arr[j][0] = 1;
                    arr[j][k] = arr[j-1][k-1] + arr[j-1][k];
                    System.out.printf("%d ", arr[j][k]);
                }
                System.out.println();
            }
        }
    }
}
