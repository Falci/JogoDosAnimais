package me.falci.animais.leitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeitorConsole implements Leitor {
	
	private final Scanner scanner = new Scanner(System.in);

	public void esperarTecla() {
		scanner.nextLine();
	}

	public boolean lerRespostaSimNao() {
		
		Map<String, Boolean> map = new HashMap<>();
		map.put("s", true);
		map.put("sim", true);
		map.put("y", true);
		map.put("yes", true);
		map.put("t", true);
		map.put("true", true);
		map.put("1", true);
		
		map.put("n", false);
		map.put("no", false);
		map.put("nao", false);
		map.put("não", false);
		map.put("false", false);
		map.put("0", false);
		
		Boolean resposta;
		do {
			resposta = map.get(scanner.next().toLowerCase());
		} while (resposta == null);

		return resposta;
	}

	public String lerTexto() {

		return scanner.nextLine();
	}

}
