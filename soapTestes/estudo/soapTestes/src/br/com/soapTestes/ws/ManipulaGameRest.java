package br.com.soapTestes.ws;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.soapTestes.manipulador.ControlaGame;
import br.com.soapTestes.model.Game;

@Path("/games")
public class ManipulaGameRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Game> getListaGamesCadastrados(){
		return ControlaGame.getListaGames();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Game getGame(@PathParam("id") Integer id){
		return ControlaGame.getListaGames().get(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response adicionaGameWs(Game game) throws URISyntaxException {
		ControlaGame.adicionaGame(game);
		return Response.created(new URI("localhost:8087/soapTestes/games")).entity(game).type(MediaType.APPLICATION_JSON).build();
	}
	
}
