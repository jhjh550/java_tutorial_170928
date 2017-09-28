import java.util.Scanner;

public class loopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("화면에 숫자를 입력해 주세요.");
		int a = s.nextInt();
		int remainder = a % 2;
		System.out.println("입력한 숫자는 "+a);
		System.out.println("나머지는 "+remainder);
		
		if(remainder == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
	}
}








