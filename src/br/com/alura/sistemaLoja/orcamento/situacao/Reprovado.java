package br.com.alura.sistemaLoja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{
	
	

	
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}


}
