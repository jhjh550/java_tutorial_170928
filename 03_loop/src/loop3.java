
public class loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<1000; i++) {
			int remainder = i%2;
			if(remainder == 0) {
				System.out.println("hello world"+i);
			}
		}
		
		for(int k=10; k>0; k--) {
			System.out.println("hello world"+k);
		}
		// 1+2+3+...+1000
		int sum = 0;
		for(int a=1; a<=1000; a++) {
			sum = sum + a;
			System.out.println("sum : "+sum);
		}
		System.out.println("sum : "+sum);
		
		
		
		
		
		
		
		
	}

}
