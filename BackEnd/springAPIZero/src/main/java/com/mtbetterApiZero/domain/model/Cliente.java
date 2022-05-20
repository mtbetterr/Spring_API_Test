package com.mtbetterApiZero.domain.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

 //se no seu código não aparecer as importações apenas com o @(import), tente escrever o import+link e deopis o @ 

public class Cliente {
	
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}	


//Não se faz necessária a criação de diversas linhas de codigo para getter e setter caso você tenha declarado o lombok
//Aqui deixei normal para que fosse legível, mas você pode reduzir o código com o lombok