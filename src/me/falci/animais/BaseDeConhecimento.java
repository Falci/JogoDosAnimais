package me.falci.animais;

import me.falci.animais.node.Animal;
import me.falci.animais.node.Node;
import me.falci.animais.node.Pergunta;

public class BaseDeConhecimento {

	private static Pergunta primeiraPergunta;
	private static Pergunta perguntaAtual;
	
	static {
		primeiraPergunta = new Pergunta("Esse animal vive na água?", new Animal("a baleia"), new Animal("o cachorro"));
	}
	
	public static Node getInicio() {
		
		return primeiraPergunta;
	}

	public static void novoConhecimento(Pergunta pergunta) {

		perguntaAtual.trocarUltimaResposta(pergunta);
	}

	public static void perguntaAtual(Pergunta pergunta) {
		
		perguntaAtual = pergunta;
	}

}
