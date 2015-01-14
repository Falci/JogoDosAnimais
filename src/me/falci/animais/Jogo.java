package me.falci.animais;

import me.falci.animais.escritor.Escritor;
import me.falci.animais.escritor.EscritorConsole;
import me.falci.animais.leitor.Leitor;
import me.falci.animais.leitor.LeitorConsole;
import me.falci.animais.node.Node;


public class Jogo {

	private Escritor escritor = new EscritorConsole();
	private Leitor leitor = new LeitorConsole();
	
	
	public void start() {
		
		mensagemInicial();

		for(;;){
			pedirParaPensarEmUmAnimal();
			
			Node node = BaseDeConhecimento.getInicio();
				
			node.executar();
			
			mensagemRecomecar();
		}

	}

	private void mensagemInicial() {
		escritor.escrever("Jogo dos animais")
				.escrever("==================");
	}

	private void pedirParaPensarEmUmAnimal() {
		escritor.escrever("Pense em um animal...")
				.escrever("<aperte enter para continuar>");
		
		leitor.esperarTecla();
	}

	private void mensagemRecomecar() {
		escritor.escrever("\nEntão vamos jogar mais uma vez...\n");
		
	}

}
