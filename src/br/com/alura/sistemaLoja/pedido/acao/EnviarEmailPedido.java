package br.com.alura.sistemaLoja.pedido.acao;

import br.com.alura.sistemaLoja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		
		System.out.println("Enviando email com dados do pedido");
	}

}
