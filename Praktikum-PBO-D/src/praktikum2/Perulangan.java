package praktikum2;
import java.util.Scanner;

public class Perulangan {
	public static void main(String[] args) {
//		inisialisasi
		Scanner input = new Scanner(System.in);
		int angka1,angka2,hasil,perhitungan;
//		input user
		System.out.print("Masukan Angka 1 : "); 
		angka1 = input.nextInt();
		System.out.print("Masukan Angka 2 : "); 
		angka2 = input.nextInt();
//		input perhitungan 
				System.out.print("Masukan angka Perhitungan : "
				+ "\n1 : +"
				+ "\n2 : -"
				+ "\n3 : *"
				+ "\n4 : /"
				+ "\n Masukan angka : ");
		perhitungan = input.nextInt();
//		pengkondisian
		if(perhitungan == 1) {
			hasil = angka1 + angka2;
			System.out.print("Hasil adalah : "+hasil);
		} else if(perhitungan == 2) {
			hasil = angka1 - angka2;
			System.out.print("Hasil adalah : "+hasil);
		}else if(perhitungan == 3) {
			hasil = angka1 * angka2;
			System.out.print("Hasil adalah : "+hasil);
		}else if(perhitungan == 4) {
			hasil = angka1 / angka2;
			System.out.print("Hasil adalah : "+hasil);
		}
		
	}

}
