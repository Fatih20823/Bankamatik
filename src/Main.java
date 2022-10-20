
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int hesap1 = 1000;
		int hesap2 = 1000;
		int kontrol = 0;
		int sifre = 3241;
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Lutfen şifrenizi giriniz");
			int mySifre =scan.nextInt();
			
			if (mySifre==sifre) {
				kontrol = 1;
				break;
				
			}
			
		}
		if (kontrol == 0) {
			System.out.println("3 kere Yanlis Girdiniz...");
		}
		
		while (kontrol == 1) {
			System.out.println("Ne Yapmak İstiyorsunuz...");
			System.out.println("1- Bakiye Ogrenme");
			System.out.println("2- Para Cekme");
			System.out.println("3- Para Yatırma");
			System.out.println("4- Hesaplar Arasi Transfer");
			System.out.println("5- Cikis");
			int secim = scan.nextInt();
		if (secim==1) {
			System.out.println("Hangi Hesabin Bakiyesini Ogrenmek İstiyorsunuz...?");
		System.out.println("1- Hesap1");
		System.out.println("2- Hesap2");
		int hesapSecim =scan.nextInt();
		
		if (hesapSecim==1) {
			System.out.println("Hesap1 bakiyeniz " + hesap1);
			
		}else if (hesapSecim == 2) {
			System.out.println("Hesap2 bakiyeniz " + hesap2);
			
		}else {
			System.out.println("Yanlis Giris Yaptini...");
		}//secim == 1 sonu
		
		
		}
		else if (secim == 2) {
			System.out.println("Hangi Hesaptan Para cekmek istiyorsunuz?...");
			System.out.println("1- Hesap1");
			System.out.println("2- Hesap2");
			int hesapSecim2=scan.nextInt();
			System.out.println("Ne kadar cekmek istiyorsunuz...?");
			int miktar1 =scan.nextInt();
			if (hesapSecim2 == 1) {
				
				if (miktar1>hesap1) {
					System.out.println("Bakiye Yetersiz...");
				}else {
					System.out.println("Hesabınızdan " + miktar1 + "Lira cekildi");
					hesap2 = hesap2 - miktar1;
					System.out.println("Hesabinizin Son Bakiyesi: " + hesap2);
				}
			}
			
		}//secin==2 sonu
		else if (secim == 3) {
			System.out.println("Hangi hesaba para yatirmak istiyorsunuz..?");
			System.out.println("1- Hesap1");
			System.out.println("2- Hesap2");
			int hesapSecim3 =scan.nextInt();
			System.out.println("Ne kadar para yatirmak istiyorsunuz...?");
			int yatirMiktar=scan.nextInt();
			if (hesapSecim3 == 1) {
				hesap1 = hesap1+yatirMiktar;
				
			}else if (hesapSecim3 ==2) {
				hesap2 = hesap2 + yatirMiktar;
				
				
			}else {
				System.out.println("Yanliş bir Secim Yaptiniz...");
			}

		}// secim3 sonu
		else if (secim == 4) {
			System.out.println("Hangi Hesaptan Transfer Yapmak İstiyorsunuz...?");
			System.out.println("1- Hesap1 => Hesap2");
			System.out.println("2- Hesap2 => Hesap1");
			int trSecim =scan.nextInt();
			System.out.println("Ne kadar Transfer yapmak İstiyorsunuz...?");
			int trMiktar =scan.nextInt();
			if (trSecim == 1) {
				if (trMiktar>hesap1) {
					System.out.println("Bakiye Yetersiz, mevcut hesap bakiyeniz: " + hesap1);
				}else {
					hesap1 = hesap1-trMiktar;
					hesap2 = hesap2+trMiktar;
					System.out.println("İsleminiz Basarıyla Gerceklestirildi...");
					
				}
			}
			if (trSecim == 2) {
				if (trMiktar > hesap2) {
					System.out.println("Bakiye yetarsiz, mevcut bakiyeniz: " + hesap2);
					
				}else {
					hesap2 = hesap2 - trMiktar;
					hesap1 = hesap1 + trMiktar;
					System.out.println("isleminiz Basariyla Gercekletirildi...");
					
					
				}
			}
		}// secim==4 sonu
		else if (secim == 5) {
			System.out.println("Program sona erdi");
			break;
		}
		}//secim==5 sonu
		
	}

}
