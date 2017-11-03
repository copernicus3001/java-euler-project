import java.math.BigInteger;


public class Euler_097 {
	public static void main(String[] args) {
		
		BigInteger liczba1 = BigInteger.valueOf(0);
		BigInteger liczba2 = BigInteger.valueOf(0);
		BigInteger liczba3 = BigInteger.valueOf(28433);
		BigInteger liczba4;
		BigInteger n = BigInteger.valueOf(2);
		BigInteger m = BigInteger.valueOf(1);
		
		liczba1 = n.pow(7830457);
		liczba4 = liczba3.multiply(liczba1);
		liczba2 = liczba4.add(m);
		
				
		String tekst = liczba2.toString();
		System.out.println(tekst.substring(tekst.length() - 10, tekst.length()));
//		for (int i = tekst.length() -1; i < tekst.length() - 10; --i) 
//			System.out.print(tekst.charAt(i));

	}

}// 8739992577 