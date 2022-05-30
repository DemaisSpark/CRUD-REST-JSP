package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Contact;

//anota classes na camada de persistência, que atuará como um repositório de banco de dados;
@Repository
//interface responsável pelo acesso a dados, estabelecendo a conexão entre o JPA e a entidade Contact
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
