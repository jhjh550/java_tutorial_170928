
public class Account{
	private int amount;
	
	public void deposit(int param) {
		amount = amount + param;
	}
	
	public int withdraw(int param) {
		if(amount < param) {
			System.out.println("����� �� �����ϴ�.");
			return 0;
		}
		
		amount = amount - param;
		return param;
	}
	
}