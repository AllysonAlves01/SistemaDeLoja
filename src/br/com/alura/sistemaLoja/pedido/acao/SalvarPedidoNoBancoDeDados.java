package br.com.alura.sistemaLoja.pedido.acao;

import br.com.alura.sistemaLoja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{
	
	public void executarAcao(Pedido pedido) {
		
		System.out.println("Salvando pedidos no Banco de Dados");
	}

}
