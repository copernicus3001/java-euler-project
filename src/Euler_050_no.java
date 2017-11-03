import java.util.ArrayList;

public class Euler_050_no {

	public static void main(String[] args) {

		ArrayList<Long> liczbyPierwsze = new ArrayList<>();
				
		for(long i = 1; i <= 1000000; i++) {	
			LiczbaPierwsza pierwsza = new LiczbaPierwsza(i);
			if(pierwsza.testuj()) liczbyPierwsze.add(i);
		}
		
		long max = 0;
		long suma = 0;
		
		for(int i = 0; i < liczbyPierwsze.size(); i++) {
			
			long number = liczbyPierwsze.get(i);			
			long chain = 0;
			for(int k = 0; k < liczbyPierwsze.size(); k++) {			
				for(int j = 0; j < liczbyPierwsze.size() - k; j++) {
					chain += liczbyPierwsze.get(j + k);
					if(number == chain) max = number;									
				}
			}
			if(max > suma) suma = max;
		}
		System.out.println(suma);		
	}
	
}
