package br.com.alura.sistemaLoja.impostos;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcular(Orcamento orcamento , Imposto imposto) {
		
		return imposto.calcular(orcamento);
	}

}

