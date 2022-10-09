package P1;

public class Main {

	public static void main(String[] args) {
		//IoC Container
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();
		
		Company company = new Company();
		company.taxNumber = "100000";
		company.companyName = "Arçelik";
		company.id = 100;
		
		Person person = new Person();
		person.nationalIdentity = "";
		person.firstName = "";
		
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
		
	}
	
}
