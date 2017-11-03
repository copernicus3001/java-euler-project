public class Euler_003 {
	public static void main(String[] args) {
		
		long n = 600851475143L;
		long max = 0;		
		int i = 2;
		
		while(i <= n) { 
			LiczbaPierwsza pierwsza = new LiczbaPierwsza(i);
			if(pierwsza.testuj() && n % i == 0) {
				max = i;
				n = n / i;
			}
			++i;
		}
		System.out.println(max);		
	}

}
/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

// 6857


