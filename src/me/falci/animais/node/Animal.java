package me.falci.animais.node;

import me.falci.animais.escritor.Escritor;
import me.falci.animais.escritor.EscritorConsole;
import me.falci.animais.leitor.Leitor;
import me.falci.animais.leitor.LeitorConsole;

public class Animal implements Node {

	private Escritor escritor = new EscritorConsole();
	private Leitor leitor = new LeitorConsole();
	
	private final String nome;

	public Animal(String nome) {
		this.nome = nome;
	}

	public void executar() {
		
		escritor.escrever("O animal que você pensou é "+nome+"? <s/n>");

		boolean resposta = leitor.lerRespostaSimNao();
		
		new Opcoes(new FimDeJogo(), new Aprender(nome)).executar(resposta);
	}


}
