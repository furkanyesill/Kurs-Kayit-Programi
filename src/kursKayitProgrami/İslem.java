package kursKayitProgrami;

import java.util.Scanner;

public class İslem {

	public static void main(String[] args) throws InterruptedException {
		Sekreter s = new Sekreter("Nurgül");
		Scanner scan = new Scanner(System.in);
		String giris = "Kurs kayıt birimine hoş geldiniz\n" + "Ben bu kursta sekreter biriminden sorumlu " + s.getAd()+"\n"
				+ "Genel olarak kurs hakkında bilgi vermek gerekirse\n"
				+ "Java,Kotlin ve Scala olmak üzere üç tür kursumuz bulunmaktadır\n"
				+ "Kurs ücretleri sabit olup 3.000 TL'dir\n"
				+ "Kursumuza kabul edilmeniz için ücreti peşin ödemeniz gerekmektedir\n"
				+ "Lütfen Kaydolmak istediğiniz kurs adını giriniz:";
		System.out.println(giris);
		String kursAdi = scan.nextLine();
		System.out.println("Lütfen kursa kaydolmak için muhasebeye yatıracağınız parayı giriniz:");
		int yatirilacakUcret = scan.nextInt();
		if (yatirilacakUcret == s.getUcret()) {
			System.out.println(" ");
			s.islemSonucu();
			Muhasebe m = new Muhasebe("Mehmet");
			m.degerlendirme(s);
		} else {
			System.out.println("Ücretin tamamını ödemediğiniz için başvurunuz reddedildi.");
			return;
		}

	}

}
