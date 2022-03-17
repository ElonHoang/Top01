package Fis.B1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public  class TotalTicket {
	public static int totalVerhicle(LocalDate dt, List<Ticket> arr) {
		int count = 0;
		if(arr != null) {
			for(var pr : arr) {
				count++;	
			}
			System.out.println("Sum :" + count + "\nDate :" + dt);
		}
		return count;
	}
	public static int sumOfPrice(List<Ticket> arr) {
		int sumPr = 0;
		if(arr != null) {
			for(var sum : arr) {
				sumPr += sum.price;
			}
			System.out.println("Sum Of Price :" + sumPr);
		}
		return sumPr;
	}
	public static int moneyRates(List<Ticket> arr) {
		int cal = 0;
		if(arr != null) {
			for(var sum : arr) {
				cal = sumOfPrice(arr) - ((sumOfPrice(arr) * 10 / 100 + (100 * totalVerhicle(LocalDate.now(), arr))));
			}
		}
		System.out.println("Money Rates :" + cal + "$");
		return cal;
	}
	public static void main(String[] args) {
		List<Ticket> arr = new ArrayList<>();
		Bike b = new Bike(35);
		MotorBike c = new MotorBike(46,"TF2222");
		arr.add(c);
		arr.add(b);
		totalVerhicle(LocalDate.now(),arr);
		sumOfPrice(arr);
		moneyRates(arr);
	}
}