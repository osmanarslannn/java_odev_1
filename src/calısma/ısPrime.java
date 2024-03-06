package calısma;



public class ısPrime {

	public static void main(String[] args) {
		int sayi=13;
		boolean isPrime=true;
		for(int i=2;i<sayi;i++) {
			if (sayi%i==0) {
			isPrime=false;
			}
			}
		if(isPrime) {
			System.out.println("sayı  asldır.");
		}
		else {
			System.out.println("sayı asal değildir.");
		}
			
		}

	}


