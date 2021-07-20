package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

public class TestaDescontos {
	
	public static void main(String[] args) {
		
		
		Filme rogueOne = new Filme("Rogue One", Duration.ofMinutes(120), "SCI-FI", BigDecimal.ONE);
		Sala sala3D = new Sala("Sala 3D", BigDecimal.TEN);
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), rogueOne, sala3D);
		
		Ingresso ingresso = new Ingresso(sessao, new DescontoParaEstudante());
		
		System.out.println("Valor da sessao original: " + sessao.getPreco());
		System.out.println("Valor do ingresso: " + ingresso.getPreco().setScale(2));
		
	}

}
