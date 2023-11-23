package perulangan;

public class For_function {
	
	public static void main(String[] args) {
		
		for (int angka=4; angka<=10; angka++) {
			System.out.println("angka ke-"+angka);
		}
		
		System.out.println("/n/n=========/n/m");
		//method do while
		//inisialisasi
		//do (pengubah)
		//while (kondisi)
		System.out.println("looping while");
		int angka=1;
		while(angka<=10) {
			
			System.out.println("angka ke-"+angka);
			angka++;
		}
		System.out.println("/n/n=========/n/m");
		
		//method while
		//inisialisasi
		//while(kondisi)(pengeubah)
		System.out.println("looping while");
		int angka1=0;
		do {
			System.out.println("angka ke-"+angka1);
			angka1++;
		}while(angka1<=5);
		
		
	}

}
