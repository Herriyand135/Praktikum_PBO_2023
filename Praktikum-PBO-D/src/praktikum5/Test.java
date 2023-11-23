package praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String [] args) {
		String namakucing, Warnakucing;
		int Beratkucing;
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan Nama Kucing : ");
		namakucing = input.next();
		
		System.out.println("Masukan Warna Kucing : ");
		Warnakucing = input.next();
		
		System.out.println("Masukan berat Kucing : ");
		Beratkucing = input.next();
		
		
		
		Cat kucingSaya = new Cat();
		kucingSaya.identitas(namakucing,Warnakucing,Beratkucing);
		System.out.println("Kucing "+kucingSaya.name+" warnanya "+kucingSaya.ambilWarna() 
		+"beratnya "+kucingSaya.ambilWarna());
		kucingSaya.eat();
	}
}
