package studyJava.refactoring;

public class RegularPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}
	
	/**
	 * 각 영화에 대한 요금 결정
	 * @param movie TODO
	 * @param daysRented TODO
	 * @return
	 */
	double getCharge(int daysRented) {
		double result = 2;
		
		if(daysRented > 2){
			result += (daysRented - 2) * 1.5;
		}

		return result;
	}

}
