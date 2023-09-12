package br.com.alura.sistemaLoja.impostos;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class ISS implements Imposto{
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
