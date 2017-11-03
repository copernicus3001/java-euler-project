import java.math.BigInteger;

public class Euler_048 {
	
	public static void main(String[] args)	{
		 
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger suma = BigInteger.valueOf(0);
		
		for(int j = 1; j <= 1000; j++)	{
			
			BigInteger n = BigInteger.valueOf(j);
			sum = n.pow(j);
			suma = suma.add(sum);
		}
		
		System.out.println(suma + "\n");
		String liczba = suma.toString();
		System.out.print(liczba.substring(liczba.length()- 10, liczba.length()));
		
		
//		for(int i = liczba.length()- 10; i <= liczba.length()-1; i++)	{
//				
//			Character c = new Character(liczba.charAt(i));
//			System.out.print(c);					
//		}	 
				
	}
}