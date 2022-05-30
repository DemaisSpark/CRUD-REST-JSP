package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Contact;

//anota classes na camada de persist�ncia, que atuar� como um reposit�rio de banco de dados;
@Repository
//interface respons�vel pelo acesso a dados, estabelecendo a conex�o entre o JPA e a entidade Contact
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
