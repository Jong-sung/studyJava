package studyJava.refactoring;

public class Movie {
	public static final int CHILDREN = 2;     //어린이용
	public static final int REGULAR = 0;      //보통
	public static final int NEW_RELEASE = 1; //최신
	
	private String _title;
	private int _priceCode;
	
	private Price _price;
	
	public Movie(String title, int priceCode){
		_title = title;
		this.setPriceCode(priceCode);
	}
	
	public int getPriceCode(){
		return _price.getPriceCode();
	}
	
	public void setPriceCode(int arg){
		switch(arg){
			case REGULAR:
				_price = new RegularPrice();
				break;
			case CHILDREN:
				_price = new ChildrenPrice();
				break;
			case NEW_RELEASE:
				_price = new NewReleasePrice();
				break;
			default:
				throw new IllegalArgumentException("Incorrect Price Code");
		}
	}
	
	public String getTitle(){
		return _title;
	}
	
	/**
	 * 포인트(frequenct renter points) 추가  
	 * @return
	 */
	int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}
	
	/**
	 * 각 영화에 대한 요금 결정
	 * @param daysRented TODO
	 * @return
	 */
	double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}
}
