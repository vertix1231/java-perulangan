package com.sqa.hellojuara.lagione;

public class HelloWorldTwo {

	enum jenisKelamin{
		Laki,Perempuan
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		char karakter = 'A';
		String karakter2 = "A";
		double nilai = 3.7;
		Double nilai2 = 3.7;
		
		Double nilai3 = new Double(3.7);
		
		System.out.println(nilai);
		System.out.println(nilai2);
		System.out.println(nilai3);
		
		jenisKelamin laki = jenisKelamin.Laki;
		jenisKelamin perempuan = jenisKelamin.Perempuan;

	}

}
