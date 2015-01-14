package me.falci.animais.node;

import me.falci.animais.BaseDeConhecimento;
import me.falci.animais.escritor.Escritor;
import me.falci.animais.escritor.EscritorConsole;
import me.falci.animais.leitor.Leitor;
import me.falci.animais.leitor.LeitorConsole;

public class Aprender implements Node {

	private Escritor escritor = new EscritorConsole();
	private Leitor leitor = new LeitorConsole();
	private String animalAtual;
	
	public Aprender(String animalAtual) {
		
		this.animalAtual = animalAtual;
	}

	public void executar() {
		escritor.escrever("hm... Então em qual animal vc pensou?")
				.escrever("<inclua o/a antes do nome>");

		String novoAnimal = leitor.lerTexto();
		
		escritor.escrever("Faça uma pergunta em que a resposta seja SIM para "+animalAtual+" mas seja NÃO para "+novoAnimal);
		
		String textoDaPergunta = leitor.lerTexto();
		
		Pergunta pergunta = new Pergunta(textoDaPergunta, new Animal(animalAtual), new Animal(novoAnimal));
		
		BaseDeConhecimento.novoConhecimento(pergunta);

	}

}
