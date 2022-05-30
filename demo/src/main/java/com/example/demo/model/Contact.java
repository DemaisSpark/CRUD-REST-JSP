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
//anotação que define que esta classe tambem é uma entidade
//o JPA estabelecerá a ligação entre a entidade e uma tabela de mesmo nome no banco de dados
@Entity
//classe em que iremos definir os atributos de uma entidade de contato
public class Contact {

	//anotação obrigatória e determina qual campo da entidade representa a chave primária da tabela no banco de dados
    @Id
    //anotação usada para realizar o mapeamento do campo da entidade com uma coluna do banco de dados
    @Column
	//anotação utilizada para informar que a geração do valor do identificador único da entidade será gerenciada pelo provedor de persistência
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
