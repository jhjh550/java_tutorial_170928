
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2000;
		
		// ����1
		if( year%4 == 0 ) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					System.out.println(year+"���� �����Դϴ�.");
				}else {
					System.out.println(year+"���� ����Դϴ�.");
				}
			}else {
				System.out.println(year+"���� �����Դϴ�.");
			}
		}else {
			System.out.println(year+"���� ����Դϴ�.");
		}
		
		//������ 4�� �������� 0 �̸� ������ �� ����
		//�׷��� 100 ���� ���������� ���
		//�ٽ� 400 ���� ���������� ����
		// ����2
		if(year%400 == 0) {
			System.out.println(year+"���� �����Դϴ�.");
		}else if(year%100 ==0){
			System.out.println(year+"���� ����Դϴ�.");
		}else if(year%4 == 0) {
			System.out.println(year+"���� �����Դϴ�.");
		}else {
			System.out.println(year+"���� ����Դϴ�.");
		}
		

	}

}





