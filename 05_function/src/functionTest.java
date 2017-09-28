
public class functionTest {

	public static void printFahrenheit(int c) {
		//(¼·¾¾¿Âµµ ¡¿ 1.8) + 32 = È­¾¾¿Âµµ
		double f = (c*1.8)+32;		
		System.out.println("¼·¾¾ "+c+"µµ´Â È­¾¾ "+f+"µµ ÀÔ´Ï´Ù.");
	}
	public static double getCelcious(double f) {
		//(È­¾¾¿Âµµ - 32) ¡À 1.8 = ¼·¾¾¿Âµµ
		double c = (f-32)/1.8;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFahrenheit(16);
		printFahrenheit(20);
		printFahrenheit(24);
		printFahrenheit(28);
		
		double c = getCelcious(70.2);
		System.out.println("È­¾¾ 70.2µµ´Â ¼·¾¾ "+c+"µµ ÀÔ´Ï´Ù.");
		
		
	}

}
