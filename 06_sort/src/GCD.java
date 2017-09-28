
public class GCD {
	// 약수, 공약수, 최대공약수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcd=0, a=12, b=18;
		int range = a;
		if(b<range)
			range = b;
		for(int i=1; i<range; i++) {
			if(a%i == 0) {
				if(b%i == 0) {
					gcd = i;
				}
			}			
		}
	}

}
