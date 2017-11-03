import java.util.ArrayList;

public class Euler_050c_no {

	public static void main(String[] args) {

		ArrayList<Long> liczbyPierwsze = new ArrayList<Long>();
		ArrayList<Long> sumyLiczbPierwszych = new ArrayList<Long>();
		long suma = 0;
		long maxLiczbaPierwsza = 0;

		for (long i = 1; i <= 1000000; i++) {
			LiczbaPierwsza pierwsza = new LiczbaPierwsza(i);
			if (pierwsza.testuj()) {
				liczbyPierwsze.add(i);
			}
		}

		for (int i = 0; i < liczbyPierwsze.size(); i++) {
			suma += liczbyPierwsze.get(i);
			if (suma <= 1000000) {
				sumyLiczbPierwszych.add(suma);
				System.out.println(suma);
			}
			
		}

		for (int i = 0; i < liczbyPierwsze.size(); i++) {
			for (int j = 0; j < sumyLiczbPierwszych.size(); j++) {

				if (liczbyPierwsze.get(i) == sumyLiczbPierwszych.get(j)) {
					if (sumyLiczbPierwszych.get(j) > maxLiczbaPierwsza) {
						maxLiczbaPierwsza = sumyLiczbPierwszych.get(j);
					}
				}
				
			}
		}

		System.out.println(maxLiczbaPierwsza);

	}
}
