package test;
import movie.*;
public class Test {
	public static void main(String[] args) {
		Customer customer = new Customer("wang"); 

		customer.addRental(new Rental(new Movie("www",Movie.REGULAR),1)); 
		customer.addRental(new Rental(new Movie("mmm",Movie.NEW_RELEASE),1)); 
		customer.addRental(new Rental(new Movie("zzz",Movie.CHILDRENS),1)); 
		System.out.println(customer.statement());
	}
}
