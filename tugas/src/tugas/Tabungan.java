package tugas;
import java.util.Scanner;

public class Tabungan {	
	private int saldo;
	
	public Tabungan(int saldo) {
	    this.saldo = saldo;
	}

	public int ambilUang(int jumlah) {
	    if (jumlah <= saldo) {
	        saldo -= jumlah;
	        return jumlah;
	    } else {
	        System.out.println("Saldo tidak mencukupi!");
	        return 0;
	    }
	}

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("====Program Penarikan Uang====");
	    System.out.print("Masukkan Saldo Awal : ");
	    int saldoAwal = input.nextInt();

	    Tabungan tabungan = new Tabungan(saldoAwal);

	    System.out.print("Jumlah uang yang diambil : ");
	    int jumlahTarik = input.nextInt();

	    int uangDitarik = tabungan.ambilUang(jumlahTarik);
	    int saldoSekarang = saldoAwal - uangDitarik;

	    System.out.println("Saldo Anda Sekarang : " + saldoSekarang);
	}
}