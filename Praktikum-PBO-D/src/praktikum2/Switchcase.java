package praktikum2;
import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		int angka1, angka2, hasil, perhitungan;
		String perhitungan;
		//
		System.out.print("Masukan angka 1: ");
		angka1 = input.nextInt();
		System.out.print("Masukan angka 2: ");
		angka1 = input.nextInt();
		//
		System.out.print("List perhitungan : "
				+ "\n + : Perhitungan"
				+ "\n - : Pengurangan"
				+ "\n * : Perkalian"
				+ "\n / : Pembagian"
				+ "\n Masukan simbol perhitungan : ");
		perhitungan = input.next();
		//
		switch(perhitungan) {
			case "+":
			hasil = angka1 + angka2;
			System.out.println("Hasil adalah : "+hasil);
			break;
			case "-":
			hasil = angka1 - angka2;
			System.out.println("Hasil adalah : "+hasil);
			break;
			case "*":
			hasil = angka1 * angka2;
			System.out.println("Hasil adalah : "+hasil);
			break;
			case "/":
			hasil = angka1 / angka2;
			System.out.println("Hasil adalah : "+hasil);
			break;
			default :
				System.out.println("Simbol tidak sesuai");
				break;
		}
				
	}

}
