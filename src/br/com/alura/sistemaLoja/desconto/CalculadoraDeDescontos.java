package br.com.alura.sistemaLoja.desconto;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.orcamento.Orcamento;



public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens // padrão Chain of Responsibility
				(new DescontoParaOrcamentoComValorMaiorQueQuinhentos
						(new SemDesconto()));
		
		return desconto.efetuarCalculo(orcamento);
	}

}
