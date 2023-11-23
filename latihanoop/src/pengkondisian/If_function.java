package pengkondisian;
import java.util.Scanner;

public class If_function {
	
	public static void main(String[] args) {
		
		// inisialisasi
		int angka;
		Scanner input = new Scanner(System.in);
		
		// input user
		System.out.print("masukan Angka = ");
		angka = input.nextInt();
		
		// pengkondisian
		if(angka > 5) {
			System.out.print("angka yang anda masukan lebih dari 5");
		} else {
			System.out.print("angka yang anda masukan kurang dari 5");
		}
		
		
	}

}
