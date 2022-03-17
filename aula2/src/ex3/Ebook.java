package ex3;

public class Ebook {
	private String titulo;
	private String autor;
	private int paginas;
	private int atual;
	
	public Ebook(String titulo, String autor, int paginas, int atual) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.atual = atual;
	}
	
	
	public void dados() {
		System.out.println("Titulo: "+this.titulo+"\nAutor: "+autor+"\n");
	}
	
	public void avancar() {
		this.atual++;
	}
	
	public void volar() {
		this.atual--;
	}
	
	public void getAtual() {
		System.out.println("Página atual: "+atual);
	}
	
}
