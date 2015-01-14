package me.falci.animais.node;

import java.util.HashMap;
import java.util.Map;

public class Opcoes {

	private final Map<Boolean, Node> opcoes = new HashMap<>(2);
	
	public Opcoes(Node sim, Node nao) {
		
		opcoes.put(true, sim);
		opcoes.put(false, nao);
	}

	public void executar(boolean resposta) {

		opcoes.get(resposta).executar();
		
	}

	public void trocarResposta(Boolean opcao, Pergunta novaOpcao) {

		opcoes.put(opcao, novaOpcao);
	}

}
