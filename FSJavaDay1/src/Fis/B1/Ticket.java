package Fis.B1;

public class Ticket {
	public int ticketNumber;
	public int price;
	public Ticket() {
		
	}
	public Ticket(int _tic) {
		this.ticketNumber = _tic;
	}
	public int getTicket() {
		return this.ticketNumber;
	}
	public void setTicket(int _tic) {
		this.ticketNumber = _tic;
	}
	public int getPrice() {
		return this.price;
	}
	private void setPrice(int _price) {
		this.price = _price;
	}
}
