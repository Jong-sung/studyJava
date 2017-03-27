package studyJava.refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name;
	private Vector _rentals = new Vector();
	
	public Customer(String name){
		_name = name;
	}
	
	public void addRental(Rental arg){
		_rentals.addElement(arg);
	}
	
	public String getName(){
		return _name;
	}
	
	public String statement(){
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while(rentals.hasMoreElements()){
			Rental each = (Rental)rentals.nextElement();
						
			//이 대여에 대한 요금 계산결과 표시
			result += "\t" + each.getMovie().getTitle() + "\t"+ String.valueOf(each.getCharge()) + "\n";
		}
		//풋터(footer) 추가
		result += "Amount owed is " + String.valueOf(this.getTotalCharge()) + "\n";
		result += "You earned "+ String.valueOf(this.getTotalFrequentRenterPoints()) + " frequent renter points";

		return result ;
	}
	
	public String htmlStatement(){
		Enumeration rentals = _rentals.elements();
		String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><p>\n";
		while(rentals.hasMoreElements()){
			Rental each = (Rental)rentals.nextElement();
						
			//이 대여에 대한 요금 계산결과 표시
			result += each.getMovie().getTitle() + ": "+ String.valueOf(each.getCharge()) + "<BR>\n";
		}
		//풋터(footer) 추가
		result += "<P>You owe <EM> " + String.valueOf(this.getTotalCharge()) + "</EM><P>\n";
		result += "On this renta you earned <EM>"+ String.valueOf(this.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";

		return result ;
	}
	
	/**
	 * 각 영화에 대한 요금 결정
	 * @return
	 */
	public double getTotalCharge(){
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()){
			Rental each = (Rental)rentals.nextElement();
			
			//각 영화에 대한 요금 결정
			result += each.getCharge();
		}
		
		return result; 
	}
	
	/**
	 * 포인트 계산 결과
	 * @return
	 */
	private int getTotalFrequentRenterPoints(){
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()){
			Rental each = (Rental)rentals.nextElement();
		
			//포인트(frequenct renter points) 추가
			result += each.getFrequentRenterPoints();
		}	
		return result;
	}
}
