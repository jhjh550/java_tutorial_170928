import java.util.Scanner;

public class Factorial {

	// 5! = 5x4x3x2x1
	public static int factorial(int n) { // ����Լ� 
		if(n==1) {
			return 1;		
		}
		
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� �Է��� �ּ���");
		Scanner s = new Scanner(System.in);
		int val = s.nextInt();
		int result = factorial(val);
		System.out.println("���丮�� ���� "+result+" �Դϴ�.");

	}

}





//int factorial = 1;
//for(int i=val; i>1; i--) {
//	factorial = factorial*i;
//}
//System.out.println("���丮�� ���� "+factorial+" �Դϴ�.");




