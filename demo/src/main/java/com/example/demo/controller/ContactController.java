package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;

//anota��o usada para marcar uma classe como Spring MVC Controller
@Controller
//classe que contem as requisi��o dos diferentes metodos CRUD, por meio de endere�os na URL
public class ContactController {

	//anota��o que fornece controle sobre onde e como a liga��o entre os beans deve ser realizada
    @Autowired
    //importa o service para que seus metodos sejam relacionados a endere�os na URL
    ContactService contactService;
    
    //anota��o usada �m um metodo para mapear sua URLsm netes caso "/read-contact"
    @RequestMapping("/read-contact")
    //metodo de leitura
    public String showReadContactPage(Model model) {
        model.addAttribute("contacts", contactService.findAll());
        //redireciona ao jsp readcontact
        return "readcontact";
    }

    //anota��o usada �m um metodo para mapear sua URLsm netes caso "/create-contact"
    @RequestMapping("/create-contact")
    //metodo de suporte a cria��o
    public String showCreateContactPage(Model model) {
        model.addAttribute("command", new Contact());
        //redireciona ao jsp createcontact
        return "createcontact";
    }

    //metodo de cria��o
    @RequestMapping(value = "/create-contact", method = RequestMethod.POST)
    public String createContact(@ModelAttribute("contact") Contact contact) {
        contactService.saveContact(contact);
        //redireciona ao jsp readcontact
        return "redirect:/read-contact";
    }

    //metodo de suporte a atualiza��o
    @RequestMapping(value = "/update-contact/{id}")
    public String showUpdateContactPage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", contactService.findById(id).orElse(null));
        //redireciona ao jsp updatecontact
        return "updatecontact";
    }

    //metodo de atualiza��o
    @RequestMapping(value = "/update-contact/{id}", method = RequestMethod.POST)
    public String updateContact(@PathVariable int id, @ModelAttribute("contact") Contact contact) {
        contactService.updateContact(id, contact);
        //redireciona ao jsp readcontact
        return "redirect:/read-contact";
    }

    //metodo de deletar
    @RequestMapping(value = "/delete-contact/{id}")
    public String deleteContact(@PathVariable int id) {
        contactService.deleteById(id);
        //redireciona ao jsp readcontact
        return "redirect:/read-contact";
    }

}
