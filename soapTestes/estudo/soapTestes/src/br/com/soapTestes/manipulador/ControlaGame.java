package br.com.soapTestes.manipulador;

import java.util.ArrayList;
import java.util.List;

import br.com.soapTestes.model.Game;

public class ControlaGame {

	private static List<Game> listaGames = new ArrayList<Game>();
	
	public ControlaGame() {
	}
	
	public static List<Game> getListaGames() {
		return listaGames;
	}
	
	public static void adicionaGame(Game game) {
		listaGames.add(game);
	}
	
}
