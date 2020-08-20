package java8Practice;



public class timestamp {
	
	public static void LocalDateTimeApi() {
	LocalDate date = LocalDate.now(); 
	System.out.println("current date  : " + date);
   
    // the current time 
    LocalTime time = LocalTime.now(); 
    System.out.println("current date : " + time);
       
   
    // will give us the current time and date 
    LocalDateTime current = LocalDateTime.now(); 
    System.out.println("current date and time : " + current); 
   
   
    // to print in a particular format 
    DateTimeFormatter format =  
      DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");   
    
    String formatedDateTime = current.format(format);   
     
    System.out.println("in foramatted manner "+ 
                        formatedDateTime); 
   
   
    // printing months days and seconds 
    Month month = current.getMonth(); 
    int day = current.getDayOfMonth(); 
    int seconds = current.getSecond(); 
    System.out.println("Month : "+month+" day : "+ 
                        day+" seconds : "+seconds); 
   
    // printing some specified date 
    LocalDate date2 = LocalDate.of(1950,1,26); 
    System.out.println("the repulic day :"+date2); 
   
    // printing date with current time. 
    LocalDateTime specificDate =  
        current.withDayOfMonth(24).withYear(2016); 
  
    System.out.println("specfic date with "+ 
                       "current time : "+specificDate); 
} 

	public static void main(String[] args) {
		
		
	  
	  
		
 LocalDateTimeApi(); 
	    
		// TODO Auto-generated method stub

	}

}
