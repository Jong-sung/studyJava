package studyJava.refactoring;

public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	/**
	 * 각 영화에 대한 요금 결정
	 * @param movie TODO
	 * @param daysRented TODO
	 * @return
	 */
	@Override
	double getCharge(int daysRented) {
		return daysRented * 3;
	}
	
	/**
	 * 포인트(frequenct renter points) 추가  
	 * @param daysRented TODO
	 * @param daysRented TODO
	 * @return
	 */
	@Override
	int getFrequentRenterPoints(int daysRented) {
		//최신(new release)을 이틀 이상 대여하는 경우 추가 포인트 제공
		if(daysRented > 1){
			return 2;
		}else{
			return 1;
		}
	}

}
