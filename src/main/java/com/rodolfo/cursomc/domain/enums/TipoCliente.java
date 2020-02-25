package com.rodolfo.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"), 
	PESSOAJURIDICA(2, "Pessoa jurídica");
	
	private int cod;
	private String nome;
	
	private TipoCliente(int cod, String nome) {
		this.cod = cod;
		this.nome = nome;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getNome() {
		return nome;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		} 
		
		for (TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		} throw new IllegalArgumentException("Id inválido" + cod);
	}
	
}
