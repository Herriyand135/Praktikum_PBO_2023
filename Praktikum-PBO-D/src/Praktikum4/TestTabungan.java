package Praktikum4;
import java.util.Scanner;

public class TestTabungan {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int saldo, tariktunai;
		
		System.out.print("Masukan Jumlah Saldo : ");
		saldo = input.nextInt();
		Tabungan tabungan = new Tabungan(saldo);
		System.out.println("saldo awal : "+tabungan.saldo);
		
		System.out.println("Masukan Saldo Penarikan : ");
		tariktunai = input.nextInt();
		tabungan.ambiluang(tariktunai);
		System.out.println("Jumlah uang yang diambil : "+tariktunai);
		System.out.println("Saldo sekarang: "+tabungan.saldo);
		
	}

}
