
public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,30,40,50,60,70,80,90}; 
		
		// average = (20+30+40+...+90)/8
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println("value : "+arr[i]);
			sum = sum + arr[i];
		}
		int average = sum / arr.length;
		System.out.println("Æò±ÕÀº :"+average);
	}

}
