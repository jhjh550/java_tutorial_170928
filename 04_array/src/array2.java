import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] arr = new int[8];
		
		int sum = 0;
		Scanner s = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+" 화면에 숫자를 입력해 주세요.");
			int a = s.nextInt();
			System.out.println("입력한 숫자는 "+a);
			arr[i] = a;
			sum = sum + a;
		}
		int average = sum / arr.length;
		System.out.println("평균은 "+average);

	}

}
