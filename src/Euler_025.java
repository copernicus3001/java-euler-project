import java.math.BigInteger;

public class Euler_025 {

	public static void main(String[] args) {
		
		int licznik = 2;
		BigInteger f1 = BigInteger.valueOf(1);
		BigInteger f2 = BigInteger.valueOf(1);
		BigInteger fibonacci = BigInteger.valueOf(1);
			
		while (fibonacci.toString().length() < 1000) {
			
			fibonacci = f1.add(f2);
			licznik ++;
			f1 = f2;
			f2 = fibonacci;
			
		}
		
		System.out.println("Pierwszym elementem w ci¹gu Fibonacciego, którego iloœæ cyfr\n przekracza"
				+ " 1000, jest element nr: " + licznik);
	}

} // 4782