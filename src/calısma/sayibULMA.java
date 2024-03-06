package calısma;

public class sayibULMA {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 7, 5, 6, 9, 10 };
		int aranacak = 11;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;

			}
		}
		if (varMi) {
			System.out.println("sayı mevcuttur.");
		}
		else {
			System.out.println("sayı mevcut değildir.");
		}
		

	}

}
