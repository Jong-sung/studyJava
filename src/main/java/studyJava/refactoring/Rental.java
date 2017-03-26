package studyJava.refactoring;

public class Rental {
	Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented){
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented(){
		return _daysRented;
	}
	
	public Movie getMovie(){
		return _movie;
	}
	
	/**
	 * 요금 계산
	 * @return
	 */
	public double getCharge(){
		return _movie.getCharge(_daysRented);
	}

	/**
	 * 포인트(frequenct renter points) 추가
	 * @return
	 */
	int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	}
}
