package main;
import printers.Printer;

public class Application {

	public static void main(String[] args) {

		Printer printer = new Printer ("Cannon", 22);
		System.out.println("model: " + printer.getModel() + ", ppm: " + printer.getPpm());

	}

}
