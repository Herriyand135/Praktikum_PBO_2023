package tugas;

public class Baterai {
	private float kuatArus;
	private float hambatan;

	public Baterai() {
	    kuatArus = 0.0f;
	    hambatan = 0.0f;
	}

	public Baterai(float kuatArus, float hambatan) {
	    this.kuatArus = kuatArus;
	    this.hambatan = hambatan;
	}

	public float getKuatArus() {
	    return kuatArus;
	}

	public float getHambatan() {
	    return hambatan;
	}

	public float hitungTegangan() {
	    return kuatArus * hambatan;
	}

	public static void main(String[] args) {
	    Baterai baterai = new Baterai(3.0f, 12.0f);
	    System.out.println("===Hukum Ohm===\nKuat arus yang mengalir pada suatu kawat penghantar\nakan berbanding lurus dengan beda potensial\npada ujung-ujung kawat penghantar tersebut\nasalkan suhu kawat dijaga konstan.\n");
	    System.out.println("Kuat Arus: " + baterai.getKuatArus() + " ampere");
	    System.out.println("Hambatan: " + baterai.getHambatan() + " ohm");
	    System.out.println("Hasil Tegangan: " + baterai.hitungTegangan() + " volt");
	}
}