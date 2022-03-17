package Fis.B2;

public class DecimalValidation implements IValidation {

	@Override
	public boolean validation(String data) {
		if( data.matches("^\\d+\\.\\d+") ) {
			return true;
		}
		return false;
	}
	
}
