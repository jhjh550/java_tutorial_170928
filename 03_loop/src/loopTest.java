import java.util.Scanner;

public class loopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("ȭ�鿡 ���ڸ� �Է��� �ּ���.");
		int a = s.nextInt();
		int remainder = a % 2;
		System.out.println("�Է��� ���ڴ� "+a);
		System.out.println("�������� "+remainder);
		
		if(remainder == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
	}
}








