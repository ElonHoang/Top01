package Fis.B2;

public class StringMaxLengthValidation implements IValidation {

	@Override
	public boolean validation(String data) {
		int max = 0;
		if(data == null)
			return false;
		while(data.length() > max) {
			max = data.length();
		}
//		if(max > data.length()) {
//			return true;
//		}	
		return false;
	}

}