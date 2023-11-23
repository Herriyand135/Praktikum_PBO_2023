package praktikum5;
// inheritance (pewarisan)
// dan visibility
public abstract class Hewan {
	protected static String name;
	protected abstract void eat();

}
class Cat extends Hewan {
	String warna;
	int berat;
// inheritance
	public void identitas(String namakucing, String warnakucing, int beratkucing){
		Cat.name = namakucing;
		warna = warnakucing;
		berat = beratkucing;
	}
	public void eat() {
		System.out.println(Cat.name + "Makan Wishkas");
	}
// visibility
	String ambilNama() {
		return Cat.name;
	}
	String ambilWarna() {
		return warna;
	}
	int ambilBerat()
	{
		return berat;
	}
		
}

