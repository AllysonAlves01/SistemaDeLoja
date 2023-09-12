package br.com.alura.sistemaLoja.pedido;

import java.time.LocalDateTime;

import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class Pedido {
	
	private String cliente;
	private LocalDateTime data;
	private Orcamento orcamento;
	
	public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
		this.cliente = cliente;
		this.data = data;
		this.orcamento = orcamento;
	}
	
	public String getCliente() {
		return cliente;
	}
	public Orcamento getOrcamento() {
		return orcamento;
	}
	public LocalDateTime getData() {
		return data;
	}

}
