package Fis.B2;

public class Component implements IValidation {

	private IValidation validation;
	private String data;
	
	public Component() {
		
	}
	public Component(String dt) {
		this.data = dt;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void display() {
		System.out.println("Data : " + this.data);
	}
	public void setValidation(IValidation val) {
		this.validation = val;
	}
	@Override
	public boolean validation(String data) {
		if(data.isEmpty()) {
			System.out.print("Data cannot be empty !");
			return false;
		}
		return true;
	}

}
