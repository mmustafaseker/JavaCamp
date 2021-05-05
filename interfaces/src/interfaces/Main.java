package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers= {new SmsLogger(), new EmailLogger(), new FileLogger(), new DatabaseLogger()}; 
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer mustafa = new Customer(1,"Mustafa","Þeker");
		
		customerManager.add(mustafa);

	}

}
