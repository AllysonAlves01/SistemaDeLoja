package br.com.alura.sistemaLoja;

import java.math.BigDecimal;

import  br.com.alura.sistemaLoja.orcamento.RegistroDeOrcamento;
import br.com.alura.sistemaLoja.http.JavaHttpClient;
import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class TestesAdapter {

	public static void main(String[] args) {
	 Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
	 orcamento.aprovar();
	 orcamento.reprovar();
	 
	 RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
	 
	 registro.registrar(orcamento);

	}

}
