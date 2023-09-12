package br.com.alura.sistemaLoja;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import br.com.alura.sistemaLoja.orcamento.Orcamento;
import br.com.alura.sistemaLoja.pedido.GeraPedido;
import br.com.alura.sistemaLoja.pedido.GeraPedidoHandler;
import br.com.alura.sistemaLoja.pedido.Pedido;
import br.com.alura.sistemaLoja.pedido.acao.EnviarEmailPedido;
import br.com.alura.sistemaLoja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestePedidos {

	public static void main(String[] args) {
		String cliente = "Rodrigo";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2"); // USANDO O PARSEINT PORQUE O ARGS É STRING, ENTAO CONVERTEMOS PARA INT
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(),
						new EnviarEmailPedido())
				);
		handler.execute(gerador);
		
	}

}
