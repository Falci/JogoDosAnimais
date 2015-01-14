package me.falci.animais.node;

import me.falci.animais.BaseDeConhecimento;
import me.falci.animais.escritor.Escritor;
import me.falci.animais.escritor.EscritorConsole;
import me.falci.animais.leitor.Leitor;
import me.falci.animais.leitor.LeitorConsole;

public class Pergunta implements Node {

	private Escritor escritor = new EscritorConsole();
	private Leitor leitor = new LeitorConsole();
	private String pergunta;
	private Opcoes opcoes;
	private boolean ultimaResposta;

	public Pergunta(String pergunta, Node respostaSim, Node respostaNao) {
		
		this.pergunta = pergunta;
		opcoes = new Opcoes(respostaSim, respostaNao);
	}

	@Override
	public void executar() {
		
		BaseDeConhecimento.perguntaAtual(this);

		escritor.escrever(pergunta);
		
		ultimaResposta = leitor.lerRespostaSimNao();
		
		opcoes.executar(ultimaResposta);		
	}

	public void trocarUltimaResposta(Pergunta novaOpcao) {
		
		opcoes.trocarResposta(ultimaResposta, novaOpcao);
	}

}
