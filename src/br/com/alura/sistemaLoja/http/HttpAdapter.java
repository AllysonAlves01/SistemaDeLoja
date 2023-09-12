package br.com.alura.sistemaLoja.http;

import java.util.Map;

public interface HttpAdapter {
	
	
	void post(String url, Map<String, Object> dados);

}
