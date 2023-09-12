package br.com.alura.sistemaLoja.impostos;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular (Orcamento orcamento);

}
