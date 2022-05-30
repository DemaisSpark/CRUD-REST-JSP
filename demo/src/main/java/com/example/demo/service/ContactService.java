package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;


//anoa��o usada em beans para indicar que ele est� mantendo a l�gica de neg�cios.
@Service
//classe que ir� conter os metodos que ser�o utilizados no CRUD
public class ContactService {

	//anota��o que fornece controle sobre onde e como a liga��o entre os beans deve ser realizada
    @Autowired
    //importa a interface do repository para que esta seja usada nos metodos
    private ContactRepository contactRepository;

    //metodo que seleciona todos os elementos da lista Contact
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    //metodo que seleciona os elementos da lista Contact, por meio de um atributo id
    public Optional<Contact> findById(int id) {
        return contactRepository.findById(id);
    }

    //metodo que salva o estado atual da lista Contact
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    //metodo que atualiza a lista Contact, poer meio da mudan�a de certos elementos
    public Contact updateContact(int id, Contact contact) {
        Contact updatedContact = contactRepository.findById(id).orElse(null);
        updatedContact.setName(contact.getName());
        updatedContact.setEmail(contact.getEmail());
        updatedContact.setTelefone(contact.getTelefone());
        return contactRepository.save(updatedContact);
    }

    //metodo que deleta elementos lista Contact
    public void deleteById(int id) {
        contactRepository.deleteById(id);
    }
}
