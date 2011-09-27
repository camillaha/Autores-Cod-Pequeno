package Autores;

public class Autores {

	public static String formata(String nomeAutor) {

		String nomeTest = nomeAutor;
		String[] palavras = nomeTest.split(" ");

		if (palavras.length < 3)
			return palavras[palavras.length - 1].toUpperCase() + ", " + palavras[0].substring(0, 1)
					.toUpperCase() + palavras[0].substring(1);
		else
			return palavras[palavras.length - 1].toUpperCase() + ", " + palavras[0].substring(0, 1)
					.toUpperCase() + palavras[0].substring(1) + " "
					+ palavras[1];
	}

}
