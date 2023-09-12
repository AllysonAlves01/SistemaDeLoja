package br.com.alura.sistemaLoja.desconto;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {
	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	
	public BigDecimal calcular(Orcamento orcamento) {
		
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
			
	}


	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		
		return orcamento.getQuantidadeItens() > 5 ;
	}


	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return null;
	}
}
