package studyJava.refactoring.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import studyJava.refactoring.Customer;
import studyJava.refactoring.Movie;
import studyJava.refactoring.Rental;

public class MovieRentalTest {

	@Ignore
	@Test 
	public void testStatement() {
		Movie movie1 = new Movie("스타워즈",Movie.REGULAR);
		Movie movie2 = new Movie("쿵푸팬더",Movie.CHILDREN);
		Movie movie3 = new Movie("조작된 도시",Movie.NEW_RELEASE);
		
		Rental rental1 = new Rental(movie1,2);
		Rental rental2 = new Rental(movie2,3);
		Rental rental3 = new Rental(movie3,3);
		
		Customer customer = new Customer("최종성");
		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.addRental(rental3);
		
		assertEquals(12.5, customer.statement());
	}
	
	@Test
	public void testStatement1() {
		Movie movie1 = new Movie("스타워즈",Movie.REGULAR);
		Movie movie2 = new Movie("쿵푸팬더",Movie.CHILDREN);
		Movie movie3 = new Movie("조작된 도시",Movie.NEW_RELEASE);
		
		Rental rental1 = new Rental(movie1,2);
		Rental rental2 = new Rental(movie2,3);
		Rental rental3 = new Rental(movie3,3);
		
		Customer customer = new Customer("최종성");
		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.addRental(rental3);
		
		assertEquals("12.5", ""+customer.getTotalCharge());
	}

}
