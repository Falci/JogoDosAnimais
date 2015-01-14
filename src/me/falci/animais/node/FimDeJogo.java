package me.falci.animais.node;

import me.falci.animais.escritor.Escritor;
import me.falci.animais.escritor.EscritorConsole;

public class FimDeJogo implements Node {

	private Escritor escritor = new EscritorConsole();
	
	public void executar() {
		
		escritor.escrever("Ok.. acertei...");
		System.exit(0);
	}

}
