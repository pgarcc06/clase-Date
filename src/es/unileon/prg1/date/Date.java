package es.unileon.prg1.date;

public class Date {

	private int day;
	private int month;
	private int year;
	
	
	public Date(int day, int month, int year){

		this.day = day;
		this.month = month;
		this.year = year;
	}
	
//YEAR
	public int getYear(){
		return this.year;
	}

//MONTH
	public int getMonth(){
		return this.month;
	}
	
//DAY
	public int getDay(){
		return this.Day;
	}

//SAME YEAR
	boolean isSameYear(int oneYear){
		if ( this.year == oneYear ){
			return true;
		}
		return false;
	}

//SAME MONTH
	boolean isSameMonth(int oneMonth){
		if ( this.month == oneMonth){
			return true;
		}
		return false;
	}

//SAME DAY
	boolean isSameDay(int oneDay){
		if ( this.day == oneDay){
			return true;
		}
		return false;
	}

//SAME DATE
	boolean isSame(Date unaFecha){
		if(dia==unaFecha.dia && mes==unaFecha.mes && año==unaFecha.año){
			return true;
		}
		return false;
	}
	
//SIN IF
public boolean isSameYearWithOutIf(int year){
	return (this.year == year);
}

public boolean isSameMonthWithOutIf(int month){
	return (this.month == month);
}

public boolean isSameDayWithOutIf(int day){
	return (this.day == day);
}

public boolean isSameWithOutIf(Date unaFecha){
	return (dia==unaFecha.dia && mes==unaFecha.mes && año==unaFecha.año);
}

//MonthName
	public String getMonthName(){
		String month "";

		swich(this.month){
			case 1: mes="Enero";
			break;
			case 2: mes="Febrero";
			break;
			case 3: mes="Marzo";
			break;
			case 4: mes="Abril";
			break;
			case 5: mes="Mayo";
			break;
			case 6: mes="Junio";
			break;
			case 7: mes="Julio";
			break;
			case 8: mes="Agosto";
			break;
			case 9: mes="Septiembre";
			break;
			case 10: mes="Octubre";
			break;
			case 11: mes="Noviembre";
			break;
			case 12: mes="Diciembre";
			break;
		}
	return month;
	}
	

}
