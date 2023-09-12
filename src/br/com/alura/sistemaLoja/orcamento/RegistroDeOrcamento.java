package br.com.alura.sistemaLoja.orcamento;

import java.util.Map;

import br.com.alura.sistemaLoja.DomainExeption;
import br.com.alura.sistemaLoja.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	private HttpAdapter http;
	
	
	
	public RegistroDeOrcamento(HttpAdapter http) {
		super();
		this.http = http;
	}



	public void registrar(Orcamento orcamento) {
		
		
		if (!orcamento.isFinalizado()) {
			throw new DomainExeption("Orcamento não finalizado!");		
		}
		String url = "http://api.externa/orcamento";	
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidadeItens()
				);
		
				
		http.post(url, dados);
	}

}
