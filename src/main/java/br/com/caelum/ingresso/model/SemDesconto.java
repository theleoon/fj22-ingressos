package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

public class SemDesconto implements Desconto {

	@Override
	public BigDecimal aplicaDesconto(BigDecimal preco) {
		return preco;
	}

}
