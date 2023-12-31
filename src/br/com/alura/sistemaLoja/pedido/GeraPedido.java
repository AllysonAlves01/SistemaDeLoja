package br.com.alura.sistemaLoja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;

	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
		super();
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}

	public String getCliente() {
		return cliente;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}
}
