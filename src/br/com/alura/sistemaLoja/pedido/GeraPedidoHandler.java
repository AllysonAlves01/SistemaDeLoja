package br.com.alura.sistemaLoja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.sistemaLoja.orcamento.Orcamento;
import br.com.alura.sistemaLoja.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.sistemaLoja.pedido.acao.EnviarEmailPedido;
import br.com.alura.sistemaLoja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		super();
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens()); 
		String cliente = "Ana da Silva";
		LocalDateTime data = LocalDateTime.now();

		Pedido pedido = new Pedido(cliente, data, orcamento);
		
		acoes.forEach(a -> a.executarAcao(pedido));

		
	}

}
