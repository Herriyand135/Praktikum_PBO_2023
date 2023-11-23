package tugas;

public class Kubus {
	private int sisi;
	private int massa;

	public Kubus(int sisi, int massa) {
	    this.sisi = sisi;
	    this.massa = massa;
	}

	public int getSisi() {
	    return sisi;
	}

	public void setSisi(int sisi) {
	    this.sisi = sisi;
	}

	public int getMassa() {
	    return massa;
	}

	public void setMassa(int massa) {
	    this.massa = massa;
	}

	public int hitungVolume(int parSisi) {
	    return parSisi * parSisi * parSisi;
	}

	public int hitungMassaJenis(int parMassa, int volume) {
	    return parMassa / volume;
	}

	public static void main(String[] args) {
	    Kubus kubus1 = new Kubus(5, 250);

	    int sisi = kubus1.getSisi();
	    int massa = kubus1.getMassa();
	        
	    System.out.println("\n===Massa Jenis Kubus===");
	    System.out.println("Sisi: " + sisi);
	    System.out.println("Massa: " + massa);

	    int volume = kubus1.hitungVolume(sisi);
	    System.out.println("\n===Hasil Perhitungan===");
	    System.out.println("Volume: " + volume);

	    int massaJenis = kubus1.hitungMassaJenis(massa, volume);
	    System.out.println("Massa Jenis Kubus: " + massaJenis);
	}
}