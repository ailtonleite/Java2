package ex3;

public class EbookMain {

	public static void main(String[] args) {
		Ebook ebook = new Ebook("O auto da barca do inferno", "Gil Vicente", 380, 20);
		ebook.dados();
		ebook.getAtual();
		ebook.avancar();
		ebook.getAtual();
		ebook.avancar();
		ebook.avancar();
		ebook.volar();
		ebook.getAtual();
	}

}
