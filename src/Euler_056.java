import java.math.BigInteger;

public class Euler_056 {	
		
	public static void main(String[] args) {
		
		int max = 0;
		int t = 0;
		BigInteger suma = BigInteger.valueOf(0);
		
		for(int e = 1; e <= 100; e++)	{
			for(int d = 1; d <= 100; d++)	{
				
				BigInteger n = BigInteger.valueOf(e);
				suma = n.pow(d);
			
				t = sumaCyfr(suma.toString());			
				if(t > max) max = t;			
			}		
		}
		
		System.out.println("Najwiêksza liczba bêd¹ca sum¹ cyfr z liczby a^b, gdzie"
				+ " a,b < 100 wynosi " + max);				
	}	

	public static int sumaCyfr(String s) {
		int sum = 0;
 
		for(int i = 0; i < s.length(); i++) {
			Character c = new Character(s.charAt(i));
			String z = c.toString();
			int j = Integer.parseInt(z);
			sum += j;
		}
		
		return sum;
	}

}// 972
