package me.falci.animais.escritor;

public class EscritorConsole implements Escritor {

	public Escritor escrever(String mensagem) {
		
		System.out.println(mensagem);
		return this;
	}

}
