package studyJava.refactoring;

public abstract class Price {
	abstract int getPriceCode();

	/**
	 * 각 영화에 대한 요금 결정
	 * @param movie TODO
	 * @param daysRented TODO
	 * @return
	 */
	abstract double getCharge(int daysRented);

	/**
	 * 포인트(frequenct renter points) 추가  
	 * @param daysRented TODO
	 * @param daysRented TODO
	 * @return
	 */
	int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
