package br.com.soapTestes.ws;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import br.com.soapTestes.model.Game;

public class TesteClient {

	public static void main(String[] args) {
		Client cliente = ClientBuilder.newClient();
		Game resposta = cliente.target("http://localhost:8087/soapTestes/games/0").request().buildGet().invoke(Game.class);
		
		System.out.println("json: "+resposta.getNome());
	}
	
}
