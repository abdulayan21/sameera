package springcore2;

public class address {
	private String strt;
	private String city;
	private String state; 

	
	
	public String getStrt() {
		return strt;
	}
	public void setStrt(String strt) {
		this.strt = strt;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStste() {
		return state;
	}
	public void setStste(String stste) {
		this.state = stste;
	}

		
	
	public void details()
	{
		System.out.println("Street:"  +strt+" city: "+city+" State:"+state+"");
	}
	

}
