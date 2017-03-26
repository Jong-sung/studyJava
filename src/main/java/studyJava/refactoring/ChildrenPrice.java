package studyJava.refactoring;

public class ChildrenPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.CHILDREN;
	}
	
	/**
	 * 각 영화에 대한 요금 결정
	 * @param movie TODO
	 * @param daysRented TODO
	 * @return
	 */
	double getCharge(int daysRented) {
		double result = 1.5;

		if(daysRented > 3){
			result += (daysRented - 3) * 1.5;
		}
		
		return result;
	}

}
