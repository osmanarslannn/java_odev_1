package calısma;

public class string {

	public static void main(String[] args) {
		String metin="Bugün hava çok güzel.";
		System.out.println("eleman sayısı :" + metin.length()); //eleman sayısını verir.
		System.out.println(" 5.eleman: " + metin.charAt(4));
		System.out.println(metin.concat("Yaşasın!"));
		System.out.println(metin.endsWith("."));
		System.out.println(metin.startsWith("B"));
		System.out.println(metin.indexOf('a'));
		System.out.println(metin.lastIndexOf('a')); // sağdaki a yı bulur başa göre indeks verir
		
		char[] karakterler=new char[5];
		metin.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(metin.replace(' ' , '-'));
		System.out.println(metin.substring(2));
		System.out.println(metin.substring(2, 5));  //5 dahil değil
		
		for(String kelime:metin.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(metin.toLowerCase());
		System.out.println(metin.toUpperCase());
		
		String metin2="   bugün hava çok güzel  ";
		System.out.println(metin2.trim());

	}

}
