import java.util.ArrayList;

public class Euler_050b_no {

	public static void main(String[] args) {

		ArrayList<Long> liczbyPierwsze = new ArrayList<Long>();

		for (long i = 1; i <= 1000000; i++) {
			LiczbaPierwsza pierwsza = new LiczbaPierwsza(i);
			if (pierwsza.testuj()) {
				liczbyPierwsze.add(i);
				//System.out.println(i);
			}
		}

		long maxLiczbapierwsza = 1;

		// sprawdzamy wszystkie liczby pierwsze z zakresu do 1000000

		for(int i = 0; i < liczbyPierwsze.size(); i++) {

			long liczba = liczbyPierwsze.get(i); // sprawdzamy np. 113

			long suma = 0;

			for(int start = 0; start < liczbyPierwsze.indexOf(liczba) - 1; start++) {

				suma += liczbyPierwsze.get(start);

				if(suma == liczba) {
					if(suma > maxLiczbapierwsza) {
						maxLiczbapierwsza = liczba;
						break;
					}
				}
				if(suma > liczba)
					break;
			}
		}
		System.out.println(maxLiczbapierwsza);
	}
	
}
