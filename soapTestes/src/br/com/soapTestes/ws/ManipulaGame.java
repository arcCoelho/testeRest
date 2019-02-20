package br.com.soapTestes.ws;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.soapTestes.manipulador.ControlaGame;
import br.com.soapTestes.model.Game;

@WebService
@Stateless
public class ManipulaGame {

	@WebMethod(operationName="adicionaJogo")
	public void adicionaGameWs(@WebParam(name="jogo") Game game) {
		ControlaGame.adicionaGame(game);
	}
	
	@WebResult(name="jogosNoCatalogo")
	public List<Game> getListaGamesCadastrados(){
		return ControlaGame.getListaGames();
	}
	
}
