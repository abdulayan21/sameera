package springcore2;

public class customer {
	private int id;
	private String name;
	private String email;
	private address adr;
	public customer() {
		super();
	}
	public customer(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public address getAdr() {
		return adr;
	}
	public void setAdr(address adr) {
		this.adr = adr;
	}
	public void disp()
	{
		System.out.println("Id:" +id+" Name :"+name+" email : "+email+"");
		adr.details();
		
	}
	
		
	}
	


