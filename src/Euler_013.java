import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;


public class Euler_013 {

	public static void main(String[] args) {
		
		String zawarto�� = "";
		BigInteger suma = BigInteger.valueOf(0);
		BigInteger liczba = BigInteger.valueOf(0);		
		
		File file = new File("src/Euler013_liczby.txt");
		try {
			Scanner in = new Scanner(file);
			try {
				zawarto�� = in.nextLine();
				liczba = new BigInteger(zawarto��);		
				suma = liczba.add(suma);
				while (in.hasNextLine()) {
					zawarto�� = in.nextLine();
					liczba = new BigInteger(zawarto��);
					suma = liczba.add(suma);
				}
				System.out.println(suma);
				System.out.println("A teraz pierwsze 10 cyfr: ");
				
				String wynik = suma.toString();
				System.out.print(wynik.substring(0, 10));
								
			} finally {
				in.close();
				}
			} catch(IOException e) {
			e.printStackTrace();
		}	
	}

}
/*Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 */

//5537376230