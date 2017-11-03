import java.math.BigInteger;
import java.util.ArrayList;

public class Euler_029 {

	public static void main(String[] args) {
		
		ArrayList<BigInteger> tabelka = new ArrayList<BigInteger>();
		BigInteger liczba; 
		BigInteger bigA;
		
		for(int a = 2; a <= 100; a++) {
			for(int b = 2; b <= 100; b++) {
						
				bigA = BigInteger.valueOf(a);
				
				liczba = bigA.pow(b);
				if(!tabelka.contains(liczba)) 
					tabelka.add(liczba);				
			}
		}
		System.out.println(tabelka.size());
	}

}
