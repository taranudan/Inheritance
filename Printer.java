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
			System.err.println("The model name entered is less than 2 characters or is empty");
		}		
	}

	public int getPpm() {
		return ppm;
	}

	public void setPpm(int ppm) {
		this.ppm = ppm;
	}
	
	

}
