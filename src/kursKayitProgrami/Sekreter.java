package kursKayitProgrami;

import java.util.Random;

public class Sekreter {
	Random random = new Random();
	private String ad;
	private int ucret = 3000;
	private int faturaNo = random.nextInt(20);

	public Sekreter(String ad) {
		this.ad = ad;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getUcret() {
		return ucret;
	}

	public void setUcret(int ucret) {
		this.ucret = ucret;
	}

	public int getFaturaNo() {
		return faturaNo;
	}

	public void setFaturaNo(int faturaNo) {
		this.faturaNo = faturaNo;
	}

	void islemSonucu() {
		String s = "Kurs kayıt işleminizi sekreterimiz " + ad + " tarafindan işleme alınmıştır\n"
				+ "Lütfen ilgili fatura numarasını muhasebe birimine iletiniz\n"
				+ "Fatura numaranız:" + faturaNo;
		System.out.println(s);
	}
}
