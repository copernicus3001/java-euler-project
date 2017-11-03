import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Euler_022 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File plik = new File("names.txt");
		Scanner odczyt = new Scanner(plik);
		StringTokenizer token;
		ArrayList<String> tablica = new ArrayList<String>();
		String imie;
		int sumaLiter;
		long valueOfName = 0;
			
		while(odczyt.hasNextLine()) {
			token = new StringTokenizer(odczyt.nextLine(), ",");
			while(token.hasMoreElements()) {
				tablica.add(token.nextToken());
			}
		}
		
		odczyt.close();
		
		Collections.sort(tablica);
		
		for(int i = 0; i < tablica.size(); i++) {
			imie = tablica.get(i);
			sumaLiter = 0;			
			for(int j = 0; j < imie.length(); j++) {
				if(imie.charAt(j) == '"') continue; 
				sumaLiter += imie.charAt(j) - 'A' + 1;				
			}
			
			valueOfName += (i + 1) * sumaLiter;			
		}	
		System.out.println("Wynik tego zadania wynosi: " + valueOfName);
	}	 
}
