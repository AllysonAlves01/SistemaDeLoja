package br.com.alura.sistemaLoja.desconto;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class SemDesconto extends Desconto {
	public SemDesconto() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		
		return true;
	}
}
