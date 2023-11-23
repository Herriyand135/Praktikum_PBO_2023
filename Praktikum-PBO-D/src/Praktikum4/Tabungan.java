package Praktikum4;

public class Tabungan {
	public int saldo;
	public Tabungan(int initsaldo) {
		saldo = initsaldo;
	}
	public void ambiluang(int jumlah) {
		saldo = saldo - jumlah;
	}

}
