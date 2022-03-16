package ex2;

public class Relogio {
	private int hora, minuto, segundo;

	
	public void mostrarHora() {
		int h = getHora();
		int m = getMinuto();
		int s = getSegundo();
		System.out.println(h+":"+m+":"+s);
	}
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora < 24) {
			this.hora = hora;
		} else {
			System.out.println("Informa um valor >= 24");
		}
		
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto < 60) {
			this.minuto = minuto;
		} else {
			System.out.println("Informa um valor >= 59");
		}
		
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo < 60) {
			this.segundo = segundo;
		} else {
			System.out.println("Informa um valor >= 59");
		}
		
	}
	
	
}
