package br.com.alura.sistemaLoja.orcamento;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.orcamento.situacao.EmAnalise;
import br.com.alura.sistemaLoja.orcamento.situacao.Finalizado;
import br.com.alura.sistemaLoja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;
	
	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;	
		this.valor = valor;
		this.situacao = new EmAnalise();
	}

	public void aplicarDescontoExtra(){
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
				this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);

	}
	public void reprovar() {
		this.situacao.reprovar(this);

	}
	private void finalizar() {
		this.situacao.finalizar(this);

	}
	
	public BigDecimal getValor() {
		return valor;
	}

public int getQuantidadeItens() {
	return quantidadeItens;
}
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public boolean isFinalizado() {
		
		return situacao instanceof Finalizado;
	}
}
