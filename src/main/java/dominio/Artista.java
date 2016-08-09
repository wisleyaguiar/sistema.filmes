package dominio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Artista {
	private Integer codArtista;
	private String nome;
	private String nacionalidade;
	private BigDecimal cache;
	private Date nascimento;
	
	private List<Participacao> participacoes;
	
	public Artista() {
		participacoes = new ArrayList<>();
	}

	public Artista(Integer codArtista, String nome, String nacionalidade, BigDecimal cache, Date nascimento) {
		super();
		this.codArtista = codArtista;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.cache = cache;
		this.nascimento = nascimento;
		participacoes = new ArrayList<>();
	}
	
	public void addParticipacao(Participacao participacao) {
		participacoes.add(participacao);
	}
	
}
