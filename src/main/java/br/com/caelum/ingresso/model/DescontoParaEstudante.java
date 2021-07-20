package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

public class DescontoParaEstudante implements Desconto {

	@Override
	public BigDecimal aplicaDesconto(BigDecimal preco) {
		return preco.multiply(new BigDecimal("0.5"));
	}

}
