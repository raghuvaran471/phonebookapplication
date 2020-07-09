package com.raghu.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import com.raghu.model.Contact;
import com.raghu.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactservice;

	@GetMapping(value = {"/","/addcontact"})

	public String ContactInfo(Model model) {
		Contact c = new Contact();
		model.addAttribute("Contact", c);
		System.out.println(c);
		return "contact";
	}

	@PostMapping(value = "/savecontact")
	public String HandleSbnBtn(@ModelAttribute("Contact") Contact c, Model model) {
		boolean isSaved = contactservice.SaveContact(c);
		if (isSaved) {
			model.addAttribute("succesmsg", "saved contact succesfully");
		} else {
			model.addAttribute("errmsg", "failed to add contact");
		}

		return "contact";
	}

	@GetMapping(value = "/viewcontacts")
	public String HandleviewcontactLink(Model model) {
		List<Contact> contactslist = contactservice.getAllcontacts();
		model.addAttribute("contacts", contactslist);
		return "contact";
	}
}
