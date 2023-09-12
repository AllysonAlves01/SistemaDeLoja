package br.com.alura.sistemaLoja;

public class DomainExeption extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainExeption(String mensagem) {
		
		super(mensagem);
		
	}
	

}
