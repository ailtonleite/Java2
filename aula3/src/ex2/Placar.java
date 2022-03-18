package ex2;

public class Placar {
	private String time1;
	private String time2;
	private int golsTime1;
	private int golsTime2;
	
	public Placar() {
		
	}

	public Placar(String time1, String time2) {
		this.time1 = time1;
		this.time2 = time2;
		this.golsTime1 = 0;
		this.golsTime2 = 0;
	}

	public Placar(String time1, String time2, int golsTime1, int golsTime2) {
		this.time1 = time1;
		this.time2 = time2;
		this.golsTime1 = golsTime1;
		this.golsTime2 = golsTime2;
	}
	
	public void mostrarPlacar() {
		System.out.println(this.time1+" "+this.golsTime1+"x"+this.golsTime2+" "+this.time2);
	}
	
}
