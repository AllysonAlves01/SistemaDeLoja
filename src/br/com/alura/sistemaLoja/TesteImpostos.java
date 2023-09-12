package br.com.alura.sistemaLoja;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.impostos.CalculadoraDeImpostos;
import br.com.alura.sistemaLoja.impostos.ISS;
import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class TesteImpostos {
public static void main(String[] args) {
	Orcamento orcamento = new Orcamento(new BigDecimal("100"), 0);
	CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

	System.out.println(calculadora.calcular(orcamento, new ISS()));
	
}
}
