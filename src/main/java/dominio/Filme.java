package dominio;

import java.util.ArrayList;
import java.util.List;

public class Filme {
	private Integer codFilme;
	private String titulo;
	private Integer duracao;
	private Integer ano;
	
	private List<Participacao> participacoes;
	
	public Filme() {
		participacoes = new ArrayList<>();
	}

	public Filme(Integer codFilme, String titulo, Integer duracao, Integer ano) {
		super();
		this.codFilme = codFilme;
		this.titulo = titulo;
		this.duracao = duracao;
		this.ano = ano;
		participacoes = new ArrayList<>();
	}
	
	public void addParticipacao(Participacao participacao){
		participacoes.add(participacao);
	}
	
	
}
