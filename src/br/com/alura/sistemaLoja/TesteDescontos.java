package br.com.alura.sistemaLoja;

import java.math.BigDecimal;

import br.com.alura.sistemaLoja.desconto.CalculadoraDeDescontos;

import br.com.alura.sistemaLoja.orcamento.Orcamento;

public class TesteDescontos {
public static void main(String[] args) {
	Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
	Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
	CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

	System.out.println(calculadora.calcular(primeiro));
	System.out.println(calculadora.calcular(segundo));
	
}
}
