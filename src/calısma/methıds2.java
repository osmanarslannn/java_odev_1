package calısma;

public class methıds2 {

	public static void main(String[] args) {
		ekle("isim");
		numm(1);
		int sayi=topla(5,9);
		System.out.println("toplam: " + sayi);
		
		String nameSurname=adSoyad("OSMAN", "ARSLAN");
		System.out.println(nameSurname);
		
		cıkart(5, 7);
		String il=sehirVer();
		System.out.println(il);
		
		int topla=topla2(5,8,7,9,5);
		System.out.println("toplam= " + topla);

	}
	
	
	

	public static void ekle(String mesaj) {           // geriye değer döndürmeyen parametreli metot
		System.out.println("ali");
	}
	
	public static void numm(int sayii) {           // geriye değer döndürmeyen parametreli metot
		System.out.println(8);
	}
	
	
	public static void cıkart(int num1,int num2) {
		int toplamm=num1-num2;
		System.out.println(toplamm);
	}
	
	
	
	public static int topla(int sayi1,int sayi2) {                   //geriye değer döndüren parametreleri tekrardan ata.
		return sayi1+sayi2;
	}
	
	public static String adSoyad(String ad,String soyad) {
		return ad+ " "+ soyad; 
	}
	public static String sehirVer() {
		return "Ankara"; 
	}
	
	public static int topla2(int...sayilar) {                            // variable argümants dizi haline getirir.
		int toplam=0;
		for(int sayi:sayilar) {
			toplam=toplam+sayi;
		}
		return toplam;
		
	}     
	
	

}
