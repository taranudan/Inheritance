package printers;

public class Printer {
	
	private String model;
	private int ppm;
	
	public Printer(String model, int ppm) {
		setModel (model);
		setPpm (ppm);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model.length() >= 2 && model != "  ") {
			this.model = model;
		}
		else {
			System.err.println("The model name cannot be less than 2 characters or be \"  \"");
		}		
	}

	public int getPpm() {
		return ppm;
	}

	public void setPpm(int ppm) {
		if (ppm > 1) {
			this.ppm = ppm;
		}
		else {
			System.err.println("Pages per Minute cannot be less than 1");
		}		
	}

	public String toString() {
		return "Printer { model=" + model + ", (ppm=" + ppm + ") }";
	}
	
	
	
}
