package br.com.alura.sistemaLoja.desconto;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {
	public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
		
	}

	public BigDecimal calcular(Orcamento orcamento) {
		 // COMPARANDO SE O VALOR É MAIOR QUE 500 REAIS , CASO POSITIVO, TEM DESCONTO
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		
		
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor().compareTo(new BigDecimal("500"))> 0;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return null;
	}
}
