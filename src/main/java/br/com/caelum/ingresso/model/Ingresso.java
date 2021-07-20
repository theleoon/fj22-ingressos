package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

public class Ingresso {
	
	private Integer id;
	
	private Sessao sessao;
	
	private BigDecimal preco;

	public Ingresso(Sessao sessao, Desconto desconto) {
		this.sessao = sessao;
		this.preco = desconto.aplicaDesconto(sessao.getPreco());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	

}
