
public class Euler_027 {

	// n*n + an + b, where |a| < 1000 and |b| < 1000

	public static void main(String[] args) {

		long liczba = 0;
		int licznik;
		int licznikMax = 0, iloczyn = 0;

		for (int a = -999; a <= 999; a++) {
			for (int b = -999; b <= 999; b++) {
				licznik = 0;
				for (int n = 0; n <= 100; n++) {
					liczba = n * n + a * n + b;
					if (liczba >= 2) {
						LiczbaPierwsza pierwsza = new LiczbaPierwsza(liczba);
						if (!pierwsza.testuj())
							break;
						else
							licznik++;
					}
					if (licznik > licznikMax) {
						licznikMax = licznik;
						iloczyn = a * b;
					}
				}
			}
		}
		System.out.println(iloczyn);
	}
}
