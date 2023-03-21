package kursKayitProgrami;

import java.util.Scanner;

public class Muhasebe {
	private String ad;

	public Muhasebe(String ad) {
		this.ad = ad;
	}

	public void degerlendirme(Sekreter s) throws InterruptedException {
		while (true) {
			Scanner scan = new Scanner(System.in);
			int faturaNumarasi;
			String a = "Merhaba ben kursun muhasebesinden sorumluyum\n"
					+ "Lütfen kayıt işlemini tamamlamak için fatura numarasını giriniz:";
			System.out.println(a);
			faturaNumarasi = scan.nextInt();
			if (faturaNumarasi == s.getFaturaNo()) {
				System.out.println(" ");
				System.out.println("Fatura numarası kontrol ediliyor...");
				Thread.sleep(3000);
				String message = "Kursun muhasebe biriminden sorumlu " + ad + " tarafından fatura numarası"
						+ "kontrol edildi ve doğru olduğu saptandı\n"
						+ "Kursumuza Hoigeldiniz...";
				System.out.println(message);
				return;
			} else {
				System.out.println(" ");
				System.out.println("Fatura numarası kontrol ediliyor...");
				Thread.sleep(3000);
				String message = "Kursun muhasebe biriminden sorumlu " + ad + " tarafından fatura numarası"
						+ "kontrol edildi ve yanlış olduğu saptandı.\n"
						+ "Lütfen fatura numarasını tekrar giriniz";
				System.out.println(message);
			}
		}
	}

}
