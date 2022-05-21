package com.mtbetterApiZero.domain.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)


 //se no seu código não aparecer as importações apenas com o @(import), tente escrever o import+link e deopis o @ 

public class Cliente {
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)

	private Long id;
	
	private String nome;
	private String email;
	@Column(name="fone")
	private String telefone;
	
}	


//Não se faz necessária a criação de diversas linhas de codigo para getter e setter caso você tenha declarado o lombok
//Aqui deixei normal para que fosse legível, mas você pode reduzir o código com o lombok