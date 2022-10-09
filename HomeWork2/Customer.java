package P1;

public class Customer {
	int id;
	String city;
	
	
	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı.");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	}
	