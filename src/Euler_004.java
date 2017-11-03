
public class Euler_004 {

	public static void main(String[] args) {
		
		int max = 0;
		int numer;
		
		for(int i=1; i<999; ++i)
			for(int j=1; j<999; ++j) {
				numer = i * j;
				if(new PalindromLiczby(numer).czyPalindrom() && numer > max) max = numer;
			}
		System.out.println("Najwiêkszy palindrom powsta³y z iloczynu dwóch liczb trzycyfrowych to " + max);
	}

}
/*
A palindromic number reads the same both ways. The largest palindrome made from the product 
of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/