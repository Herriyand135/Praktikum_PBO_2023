package Getter_Setter;

public class PersegiPanjang {
	private double sisi;
	
	public double getSsisi() {
		return sisi;
	}
	
	public void setsisi(double sisi) {
		this.sisi = sisi;
	}
	
	public double hitungKeliling()
	{
		return sisi*4;
	}
	
	public double hitungLuas()
	{
		return sisi*sisi;
	}
}
