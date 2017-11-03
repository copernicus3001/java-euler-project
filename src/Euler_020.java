import java.math.BigInteger;

public class Euler_020 { 
	public static void main(String[] args) {
		
		BigInteger silnia = BigInteger.valueOf(1);
		
		for (int i = 1; i <= 100; i++)	{
		
			BigInteger n = BigInteger.valueOf(i);
			silnia = silnia.multiply(n);			
		}			
		System.out.println(silniaSumaCyfr(silnia.toString()));		
	}
	
	public static int silniaSumaCyfr (String s)
	{
		int sum = 0;
 
		for(int i = 0; i < s.length(); i++)	{
			
			Character c = new Character(s.charAt(i));
			String z = c.toString();
			int j = Integer.parseInt(z);
			sum += j;
		} 
		return sum;
	}
	
}
