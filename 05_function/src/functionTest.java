
public class functionTest {

	public static void printFahrenheit(int c) {
		//(�����µ� �� 1.8) + 32 = ȭ���µ�
		double f = (c*1.8)+32;		
		System.out.println("���� "+c+"���� ȭ�� "+f+"�� �Դϴ�.");
	}
	public static double getCelcious(double f) {
		//(ȭ���µ� - 32) �� 1.8 = �����µ�
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
		System.out.println("ȭ�� 70.2���� ���� "+c+"�� �Դϴ�.");
		
		
	}

}
