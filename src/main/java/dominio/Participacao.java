package dominio;

import java.math.BigDecimal;

public class Participacao {
	private Integer codParticipacao;
	private String personagem;
	private BigDecimal desconto;
	
	private Filme filme;
	private Artista artista;
	
	public Participacao(){
		
	}

	public Participacao(Integer codParticipacao, String personagem, BigDecimal desconto, Filme filme, Artista artista) {
		super();
		this.codParticipacao = codParticipacao;
		this.personagem = personagem;
		this.desconto = desconto;
		this.filme = filme;
		this.artista = artista;
		artista.addParticipacao(this);
		filme.addParticipacao(this);
	}
	
}
