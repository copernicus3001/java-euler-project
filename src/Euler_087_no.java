import java.util.ArrayList;

public class Euler_087_no {

	public static void main(String[] args) {
		//poni¿ej 50 milionów
		
		ArrayList<Integer> liczbyPierwsze = new ArrayList<>();
		ArrayList<Long> wyniki = new ArrayList<>();
		int granica = (int)Math.sqrt(50000000); 	
		long d;
		
		//tworzymy tablicê liczb pierwszych
		for(int i = 1; i < granica; i++) {	
			LiczbaPierwsza pierwsza = new LiczbaPierwsza(i);
			if(pierwsza.testuj()) liczbyPierwsze.add(i);
		}
		
		for(Integer a : liczbyPierwsze) {
			for(Integer b : liczbyPierwsze) {
				for(Integer c : liczbyPierwsze) {
					d = c * c + b * b * b + a * a * a * a;
					if(d < 50000000) 
						if(!wyniki.contains(d)) wyniki.add(d); 
					else break;
				}
			}
		}		
		System.out.println(wyniki.size());
	}

}
