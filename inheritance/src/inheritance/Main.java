package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer musti = new IndividualCustomer();
		musti.customerNumber="123456";
		
		CorporateCustomer seker= new CorporateCustomer();
		seker.customerNumber ="7896";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber ="999999";
		
		CustomerManager manager = new CustomerManager();
		//manager.add(musti);
		//manager.add(seker);
		//manager.add(abc);
		
		Customer[] customer = {musti, seker, abc};
		
		manager.addMultiple(customer);
	}

}
