package intro;
import java.util.Scanner;
public class main extends perkalian{

	public static void Main(String [] args) {
		// TODO Auto-generated method stub
		//
		int angka1;
		int loop;
		Scanner input1 = new Scanner(System.in);
		Scanner loop_input = new Scanner(System.in);
		
		
		
		// Data diri
		System.out.print("nama : herriyandi Nugroho\n");
		System.out.print("kelas : Reg D\n");
		System.out.print("prodi : Teknik infromatika\n");
		System.out.print("=================\n ");
		System.out.print("/n");
		
		System.out.print("masukan perulangan : ");
		loop = loop_input.nextInt();
		
		//looping funciton
		for(int i=1;1<=loop;i++) {
			//input user
			System.out.print("masukan perhitungan yang ingin dilakukan : \n"
					+"1. perkalian\n"
					+"2. pembagian\n"
					+"3. penambahan\n"
					+"4. pengurangan\n"
					+"masukan angka : ");
			angka1 = input1.nextInt();
			
			//PENGKONDISIAN
			if (angka1 == 1) {
				Perkalian();
			}else if (angka1 == 2) {
				pembagian();
			}else if (angka1 == 3) {
				penambahan();
			}else if (angka1 == 4 ) {
				pengurangan();
			}else {
				System.out.println("angka yang anda masukan salah");
				
			}
		
		
		
		

	}
	}
	
}

