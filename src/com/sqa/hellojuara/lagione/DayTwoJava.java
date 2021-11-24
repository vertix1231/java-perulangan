package com.sqa.hellojuara.lagione;

import java.util.Scanner;

public class DayTwoJava {

	public static void main(String[] args) {
		// explicit(manual casting)
		short data1 = 3;
		char char_data = (char) data1; // short ke char
		long data2 = 246447;
		byte byte_data = (byte) data2;// long ke byte
		int data3 = 34;
		char char_data2 = (char) data3;// int ke char
		char data4 = 1;
		short short_data2 = (short) data4;// char ke short
		double data5 = 345.3;
		float float_data2 = (float) data5;// double ke float
		System.out.println("Short ke Char: " + char_data);
		System.out.println("Long ke Byte: " + byte_data);
		System.out.println("Int ke Char: " + char_data2);
		System.out.println("Char ke Short: " + short_data2);
		System.out.println("Double ke Float: " + float_data2);
		
		System.out.println("batasssssssssssssss");
		
		// implicit(auto casting)
		short data11 = 457;
		double double_data1 = data11; // short ke double
		char data21 = 'W';
		long long_data1 = data21;// char ke long
		int data31 = 456;
		float int_data1 = data31;// int ke float
		byte data41 = 127;
		long long_data21 = data41;// byte ke long
		float data51 = 565.3f;
		double double_data21 = data51;// float ke double System.out.println("Short ke Double: "+ double_data);
										// System.out.println("Char ke Long: "+long_data); System.out.println("Int ke
										// Float: "+int_data); System.out.println("Byte ke Long: "+long_data2);
		System.out.println("Short ke Double: " + double_data1);
		System.out.println("Char ke Long: " + long_data1);
		System.out.println("Int ke Float: " + int_data1);
		System.out.println("Byte ke Long: " + long_data21);
		System.out.println("Float ke Double: " + double_data21);
		
		Scanner input = new Scanner(System.in);
		System.out.println("masukan input data: ");
		int hasilInput = input.nextInt();
		double hasildbl =  hasilInput;
//		int hasilInputtes = input;
		
//		System.out.println(hasilInputtes);
		System.out.println("hasil input auto casting adalah: "+hasildbl);
		System.out.println("hasil input auto casting adalah tapi ga berubah: "+hasilInput);
		
		if(hasilInput<=10) {
			System.out.println("selamat pagi");
		}else if(hasilInput<=16){
			System.out.println("selamat siang");
		}else if(hasilInput<=18){
			System.out.println("selamat sore");
		}else{
			System.out.println("selamat malam");
		}
		
		
		switch(hasilInput) {
		case 1:
			System.out.println("selamat pagi");
			break;
		case 2:
			System.out.println("selamat pagi");
			break;
		case 3:
			System.out.println("selamat pagi");
			break;
		case hasilInput>3:
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
