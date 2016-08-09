package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Filme implements Serializable {
	private static final long serialVersionUID = 1L;
	
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
		participacao.setFilme(this);
	}
	
	public void removeParticipacao(Participacao participacao) {
		participacoes.remove(participacao);
	}

	public Integer getCodFilme() {
		return codFilme;
	}

	public void setCodFilme(Integer codFilme) {
		this.codFilme = codFilme;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public List<Participacao> getParticipacoes() {
		return participacoes;
	}

	public void setParticipacoes(List<Participacao> participacoes) {
		this.participacoes = participacoes;
	}

	@Override
	public String toString() {
		return "Filme [codFilme=" + codFilme + ", titulo=" + titulo + ", duracao=" + duracao + ", ano=" + ano + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codFilme == null) ? 0 : codFilme.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		if (codFilme == null) {
			if (other.codFilme != null)
				return false;
		} else if (!codFilme.equals(other.codFilme))
			return false;
		return true;
	}
	
	
}
