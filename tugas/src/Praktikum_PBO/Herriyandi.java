package Praktikum_PBO;

import java.util.Scanner;

public class Herriyandi {
	public static void main(String [] args) {
		int angka1;
		int loop;
		Scanner input1 = new Scanner(System.in);
		Scanner loop_input = new Scanner(System.in);
		
		// Data Diri
		System.out.print("nama  : Herriyandi Nugroho\n");
		System.out.print("kelas : Reg D\n");
		System.out.print("prodi : Teknik infromatika\n");
		System.out.print("=================\n ");
		System.out.print("/n");
		
		System.out.print("masukan perulangan : ");
		loop = loop_input.nextInt();
		
		//looping funciton
		for(int i = 1; 1 <= loop; i++) {
			//input user
			System.out.print("masukan perhitungan yang ingin dilakukan : \n"
					+"1. perkalian\n"
					+"2. pembagian\n"
					+"3. penambahan\n"
					+"4. pengurangan\n"
					+"masukan angka : ");
			angka1 = input1.nextInt();
			
			//Pengkondisian
			if (angka1 == 1) {
				
				//implementasi penambahan
				System.out.println("Masukan Angka 1 Untuk Penambahan: ");
				int angkaTambah = input1.nextInt();
				
				//implementasi pengurangan
			} else if (angka1 ==2) {
				System.out.println("Masukan Angka 1 Untuk Pengurangan: ");
				int angkaKurang = input1.nextInt();
				
				//imp;ementasi perkalian
				
			} else if (angka1 ==3) {
				System.out.println("Masukan Angka 1 Untuk Perkalian: ");
				int angkaKali = input1.nextInt();
				
				//implementasi pembagian
				
			} else if (angka1 ==4) {
				System.out.println("Masukan Angka 1 Untuk Pembagian: ");
				int angkaBagi = input1.nextInt();
			
			} else { System.out.println("Angka yang anda masukan salah");
			
			}
				
		}
		
	}

}
