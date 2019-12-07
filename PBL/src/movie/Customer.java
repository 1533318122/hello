package movie;

import java.util.Enumeration;
import java.util.Vector;

//Customer (顾客)
//Customer类用来表示顾客。就像其他类一样,它也拥有数据和相应的访问函数:
public class Customer {
	private String _name;
	private Vector _rentals = new Vector();

	public Customer(String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			
			Rental each = (Rental) rentals.nextElement();
			frequentRenterPoints += each.getFrequentRenterPoints();

//show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
			
		}
//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints() ) + " frequent renter points";
		return result;
	}
	private double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
			
		}
		return result;
	}
private int getTotalFrequentRenterPoints() {
	int result = 0;
	Enumeration rentals = _rentals.elements();
	while (rentals.hasMoreElements()) {
		Rental each = (Rental) rentals.nextElement();
		result += each.getFrequentRenterPoints();
	}
	return result;
}

}
