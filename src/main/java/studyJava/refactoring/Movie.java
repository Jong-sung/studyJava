package studyJava.refactoring;

public class Movie {
	public static final int CHILDREN = 2;     //어린이용
	public static final int REGULAR = 0;      //보통
	public static final int NEW_RELEASE = 1; //최신
	
	private String _title;
	private int _priceCode;
	
	public Movie(String title, int priceCode){
		_title = title;
		_priceCode = priceCode;
	}
	
	public int getPriceCode(){
		return _priceCode;
	}
	
	public void setPriceCode(int arg){
		_priceCode = arg;
	}
	
	public String getTitle(){
		return _title;
	}
	
	/**
	 * 포인트(frequenct renter points) 추가
	 * @return
	 */
	int getFrequentRenterPoints(int daysRented) {
		//최신(new release)을 이틀 이상 대여하는 경우 추가 포인트 제공
		if((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1){
			return 2;
		}else{
			return 1;
		}
		
	}
	
	/**
	 * 각 영화에 대한 요금 결정
	 * @param daysRented TODO
	 * @return
	 */
	double getCharge(int daysRented) {
		double result = 0;
		switch(this.getPriceCode()){
			case Movie.REGULAR:
				result += 2;
				if(daysRented > 2){
					result += (daysRented - 2) * 1.5;
				}
				break;
			case Movie.NEW_RELEASE:
				result += daysRented * 3;
				break;
			case Movie.CHILDREN:
				result += 1.5;
				if(daysRented > 3){
					result += (daysRented - 3) * 1.5;
				}
				break;
		}
		return result;
	}
}
