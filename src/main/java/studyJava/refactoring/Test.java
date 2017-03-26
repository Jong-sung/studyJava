package studyJava.refactoring;

public class Test {
	public static void main(String args[]){
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
		
		System.out.println(customer.statement());
		System.out.println("============================================");
		System.out.println(customer.htmlStatement());
	}
}
