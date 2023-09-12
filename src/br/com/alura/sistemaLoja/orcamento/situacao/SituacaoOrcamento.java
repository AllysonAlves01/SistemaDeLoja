package br.com.alura.sistemaLoja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.DomainExeption;
import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
		
	
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainExeption("Orcamento não pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainExeption("Orcamento não pode ser aprovado!");
	}
	public void finalizar(Orcamento orcamento) {
		throw new DomainExeption("Orcamento não pode ser aprovado!");
	}

}
