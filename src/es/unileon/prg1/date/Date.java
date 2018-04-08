//PABLO GARCIA CELADILLA

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
	

	public int getYear(){
		return this.year;
	}


	public int getMonth(){
		return this.month;
	}
	

	public int getDay(){
		return this.day;
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
	return (dia == unaFecha.dia && mes == unaFecha.mes && año == unaFecha.año);
}

//IMPRIME EL NOMBRE DEL MES
	public String getMonthName(){
		String month= "";

		swich(this.month){
			case 1: mes="ENERO";
				break;
			case 2: mes="FEBRERO";
				break;
			case 3: mes="MARZO";
				break;
			case 4: mes="ABRIL";
				break;
			case 5: mes="MAYO";
				break;
			case 6: mes="JUNIO";
				break;
			case 7: mes="JULIO";
				break;
			case 8: mes="AGOSTO";
				break;
			case 9: mes="SEPTIEMBRE";
				break;
			case 10: mes="OCTUBRE";
				break;
			case 11: mes="NOVIEMBRE";
				break;
			case 12: mes="DICIEMBRE";
				break;
		}
	return month;
	}
	
//VERIFICA SI ELDIA DELMES ES CORRECTO
	public boolean fechaCorrecta(int day,int month,int year){

		if(day<=0 || day>31 || year<0 || month<=0 ||month>12){
			return false;
		}
		if((day<=31 && (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12))){
			return true;
		}
		else if((day<=30) && (month==4 || month==6 || month==9 || month==11)){
			return true;
		}
		else if(day<29 && month==2){
			return true;
		}
		else{
			return false;
		}
	}

//IMPRIME LA ESTACION DE ESTE MES
	public String seasonMonth(int month,int day){
		String season="";

		switch(month){
			case 1: season="Estación: INVIERNO";
				break;
			case 2: season="Estación: INVIERNO";
				break;
			case 3: 
				if (this.day<=21){
					season="Estación: INVIERNO";
				}
				else{
					season="Estación: PRIMAVERA";
				}
				break;
			case 4: season="Estación: PRIMAVERA";
				break;
			case 5: season="Estación: PRIMAVERA";
				break;
			case 6: 
				if (this.day<=21){
					season="Estación: PRIMAVERA";
				}
				else{
					season="Estación: VERANO";
				}
				break;
			case 7: season="Estación: VERANO";
				break;
			case 8: season="Estación: VERANO";
				break;
			case 9: if (this.day<=21){
					season="Estación: VERANO";
				}
				else{
					season="Estación: OTOÑO";
				}
				break;
			case 10: season="Estación: OTOÑO";
				break;
			case 11: season="Estación: OTOÑO";
				break;
			case 12:if (this.day<=21){
					season="Estación: OTOÑO";
				}
				else{
					season="Estación: INVIERNO";
				}
				break;
			}
	return season;
	}

//IMPRIME LOS MESES QUE FALTAN HASTA FINAL DE AÑO
	public int mesesHastaFinalDeAño(int month){
		int i,j=0;
			for(i=month; i<=12; i++){
				j++;
			}
	return j;
	}

//IMPRIMEUNA FECHA
	public void imprimirFecha(Date fecha){
		String mesString=pasarMesString(fecha.mes);
		System.out.println(fecha.dia+" de " +mesString+" de "+fecha.año);
	}

//DIAS DESDE EL PRIMER DEL AÑO
	public int diasTranscurridosAño(Date fecha){
		int diasTotales = 0;

		switch(fecha.mes){

			case 1:diasTotales=0;
				break;
			case 2:diasTotales=31;
				break;
			case 3:diasTotales=59;
				break;
			case 4:diasTotales=90;
				break;
			case 5:diasTotales=120;
				break;
			case 6:diasTotales=151;
				break;
			case 7:diasTotales=181;
				break;
			case 8:diasTotales=212;
				break;
			case 9:diasTotales=243;
				break;
			case 10:diasTotales=273;
				break;
			case 11:diasTotales=304;
				break;
			case 12:diasTotales=334;
				break;
		
		
		}
		diasTotales+=fecha.dia;
		System.out.println("Han transcurrido "+diasTotales+" desde principio de año ");
		
	}
//INTENTO PARA GENERAR FECHA ALEATORIA IGUAL A FECHA while
	public int intentosAcertarFechaWhile() throws MiExcepcion{
		int intentos=0;
		Random randomNumer=new Random();
		randomNumer.setSeed(System.currentTimeMillis());
		Date fechaAleatoria = new Date(1,1,5000);
		while(!isSame(fechaAleatoria)){

			int diaAleatorio=randomNumer.nextInt(31)+1;
			int mesAleatorio=randomNumer.nextInt(12)+1;

			if(fechaCorrecta(diaAleatorio,mesAleatorio,año)){

				fechaAleatoria=new Date(diaAleatorio,mesAleatorio,año);
				intentos++;
			
			}
		}
			System.out.println("Intentos "+intentos);
			return intentos;
	}
//INTENTO PARA GENERAR FECHA ALEATORIA IGUAL A FECHA do-while
	public int intentosAcertarFecha(int day, int month){
		int intentos=0;
		
		
		Random randomNumer=new Random();
		randomNumer.setSeed(System.currentTimeMillis());
		Date fechaAleatoria = new Date(1,1,5000);
		do{
			int diaAleatorio=randomNumer.nextInt(31)+1;
			int mesAleatorio=randomNumer.nextInt(12)+1;

			if(fechaCorrecta(diaAleatorio,mesAleatorio,año)){

				fechaAleatoria=new Date(diaAleatorio,mesAleatorio,año);
				intentos++;
			}
		}
		while(!isSame(fechaAleatoria));
			System.out.println("Intentos "+intentos);

	return intentos;
		
	}


//DIA DE LA SEMANA
	public String diaSemana(int day, int month){
		
		int a=0,num=0;
		String _dia="";

		for(int i=1;i<=num;i++){
			a++;
		}
		switch(a) {
			
			case 1:  _dia="LUNES";
				break;
			case 2: _dia="MARTES";
				break;
			case 3:  _dia="MIERCOLES";
				break;
			case 4:  _dia="JUEVES";
				break;
			case 5:  _dia="VIERNES";
				break;
			case 6: _dia="SABADO";
				break;
			case 7:  _dia="DOMINGO";
				break;
		}		

	return _dia;
	}
}


