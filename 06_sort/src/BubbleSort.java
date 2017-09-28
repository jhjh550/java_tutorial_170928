
public class BubbleSort {

	public static void printString(int[] values) {
		for(int i=0; i<values.length; i++) {
			System.out.print(" "+values[i]);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {8,5,1,3,9,2,4};
		
		for(int k=0; k<values.length-1; k++) {
			for(int i=0; i<values.length-1-k; i++) {
				if(values[i] > values[i+1]) {
					int temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
				}
				printString(values);
			}
		}
	}
}
