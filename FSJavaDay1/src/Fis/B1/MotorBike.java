package Fis.B1;

public class MotorBike extends Ticket {
	
private String verhicleNum;
public MotorBike() {
	
}
public MotorBike(int _tic, String _num) {
	this.ticketNumber = _tic;
	this.verhicleNum = _num;
	this.price = 1000;
}
public int getMotorBikeTicket() {
	return this.ticketNumber;
}
public String getVerhicleNumber() {
	return this.verhicleNum;
}
public void setMotorBikeTicket(int _tic) {
	this.ticketNumber = _tic;
}
public void setVerhicleNumber(String _num) {
	this.verhicleNum = _num;
}
public String toString() {
	return("[MortorBike] :\n TicketNumber :" + getMotorBikeTicket()
			+ "\n VerhicleNumber :" + getVerhicleNumber());
}
}
