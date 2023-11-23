package tugas;

public class Kalkulator {
	private double value1;
	private double value2;
    
	public double getValue1() {
	    return value1;
	}

	public void setValue1(double value1) {
	    this.value1 = value1;
	}

	    
	public double getValue2() {
	    return value2;
	}

	public void setValue2(double value2) {
	    this.value2 = value2;
	}

	public void setNameProject() {
	    System.out.println("Kalkulator Project");
	}

	public void setNoteProject(String note) {
	    System.out.println("Note: " + note);
	}

	public double add(double val1, double val2) {
	    return val1 + val2;
	}

	public double minus(double val1, double val2) {
	    return val1 - val2;
	}

	public double multiplication(double val1, double val2) {
	    return val1 * val2;
	}

	public double division(double val1, double val2) {
	    if (val2 == 0) {
	        System.out.println("Error: Division by zero");
	        return Double.NaN; 
	    }
	    return val1 / val2;
	}

	public static void main(String[] args) {
	    Kalkulator kalkulator = new Kalkulator();
	    kalkulator.setNameProject();

	    kalkulator.setValue1(7.0);
	    kalkulator.setValue2(5.0);

	    System.out.println("Value 1: " + kalkulator.getValue1());
	    System.out.println("Value 2: " + kalkulator.getValue2());

	    kalkulator.setNoteProject("This project shown you how to manage method in java");

	    System.out.println("Result Add is: " + kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
	    System.out.println("Result Minus is: " + kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
	    System.out.println("Result Multiple is: " + kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
	    System.out.println("Result Division is: " + kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));
	}
}