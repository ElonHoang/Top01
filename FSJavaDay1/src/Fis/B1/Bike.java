package Fis.B1;

public class Bike extends Ticket {
	
public Bike() {

}
public Bike(int _ticket) {
	this.ticketNumber = _ticket;
	this.price = 500;
}
public int getBicycleTicket() {
	return this.ticketNumber;
}
public void setBicycleTicket(int _ticket) {
	this.ticketNumber = _ticket;
}
public String toString() {
	return("[Bike] :\n TicketNumber :" + getBicycleTicket());
}
}