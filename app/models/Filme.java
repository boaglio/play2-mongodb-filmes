package models;

import java.util.List;

import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.ObjectId;
import play.modules.mongodb.jackson.MongoDB;

public class Filme {

	@Id
	@ObjectId
	public String id;

	public String nome;

	public String tipo;

	public Double nota;

	public Integer duracao;

	public Integer ano;

	public String genero;

	public Integer votos;

	public String url;

	public Diretor diretor;

	public static List<Filme> all() {
		return Filme.coll.find().toArray();
	}

	private static JacksonDBCollection<Filme,String> coll = MongoDB.getCollection("filmes",Filme.class,String.class);

}
