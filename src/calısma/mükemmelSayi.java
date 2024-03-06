package calısma;

public class mükemmelSayi {

	public static void main(String[] args) {
		
		int number=6;
		int toplam =0;
		
		for(int i=1;i<number;i++) {
			if (number%i==0) {
				toplam=toplam+i;
			}

		}
		if(toplam==number) {
			
			System.out.println("MÜKEMMEL SAYIDIR");
		}
		else {
			System.out.println("MÜKEMMEL SAYI DEĞİLDİR");
		}
		
		

	}

}
