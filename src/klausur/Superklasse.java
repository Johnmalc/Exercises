package klausur;

public class Superklasse implements Inter {
	String domecek;
	int cilso;
	double blbost;
	
	public double getBlbost() {
		return blbost;
	}
	
	public void setDomecek(String barva){
		this.domecek = barva;
	}
	
	public String getDomecek() {
		return domecek;
	}

	public void ko() {
		System.out.println("sdfs");
		
	} 

}
