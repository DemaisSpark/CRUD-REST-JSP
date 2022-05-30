package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//anota��o que define que esta classe tambem � uma entidade
//o JPA estabelecer� a liga��o entre a entidade e uma tabela de mesmo nome no banco de dados
@Entity
//classe em que iremos definir os atributos de uma entidade de contato
public class Contact {

	//anota��o obrigat�ria e determina qual campo da entidade representa a chave prim�ria da tabela no banco de dados
    @Id
    //anota��o usada para realizar o mapeamento do campo da entidade com uma coluna do banco de dados
    @Column
	//anota��o utilizada para informar que a gera��o do valor do identificador �nico da entidade ser� gerenciada pelo provedor de persist�ncia
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //atributo id
    private Integer id;

    @Column
    //atributo nome
    private String name;

    @Column
    //atributo email
    private String email;

    @Column
    //atributo telefone
    private String telefone;

	public Integer getId() {
		return id;
	}

	//get e sets a seguir:
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
