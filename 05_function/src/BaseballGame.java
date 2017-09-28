import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int[] numbers = new int[3];
		for(int i=0; i<3; i++) {
			numbers[i] = random.nextInt(10);
			System.out.println("num:"+numbers[i]);
		}
		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("숫자 세개를 입력해 주세요");
			int[] myNumbers = new int[3];
			for(int i=0; i<3; i++) {
				myNumbers[i] = s.nextInt();
			}
			
			int strikeCount = 0;
			int ballCount = 0;
			for(int i=0;i<3; i++) {
				for(int k=0; k<3; k++) {
					if(myNumbers[i] == numbers[k]) {
						if(i==k)
							strikeCount++;
						else
							ballCount++;
					}
				}
			}			
			
			System.out.println("strike:"+strikeCount+"ball:"+ballCount);
			if(strikeCount == 3) {
				flag = false;
			}
		}
		System.out.println("game end");
		
	}

}
