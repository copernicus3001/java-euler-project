import java.util.ArrayList;
import java.util.Collections;


public class PalindromLiczby {
	
	private int liczba;
	
	public PalindromLiczby(int n) {
		liczba = n;
	}
	
	public boolean czyPalindrom() {
		
		String tekst = String.valueOf(liczba);
		ArrayList<String> tablica = new ArrayList<String>();
		ArrayList<String> tablica2 = new ArrayList<String>();
		
		for(int i=0; i<tekst.length(); ++i)
			tablica.add(tekst.charAt(i) + "");
		
		tablica2.addAll(tablica);
		Collections.reverse(tablica2);
		
		for(int i=1; i<tablica.size(); ++i) 
			if(!tablica.get(i).equals(tablica2.get(i))) return false;
		return true;				
	}	

}
