import java.util.Scanner;

public class Fibonacci {
	public static int fibo(int n) {
		if(n==1 || n==2)
			return 1;
		
		return fibo(n-1) + fibo(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
		System.out.println("숫자를 입력해 주세요");
		Scanner s = new Scanner(System.in);
		int val = s.nextInt();
		int result = fibo(val);
		System.out.println(result);
//		int result = 0;
//		int a1 = 0;
//		int a2 = 1;
//		for(int i=1; i<=val; i++) {
//			result = a1 + a2;
//			System.out.println(result);
//			a1 = a2;
//			a2 = result;			
//		}
		
	}

}
