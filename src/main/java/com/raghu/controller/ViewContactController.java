package com.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.raghu.model.Contact;
import com.raghu.service.ContactService;

@Controller

public class ViewContactController {
	@Autowired
	private ContactService contactservice;
	@GetMapping(value="/Editcontact")
	public String Editcontact(@RequestParam("cid") Integer contactId,Model model) {
		Contact c = contactservice.getContactById(contactId);
		model.addAttribute("contacts", c);
		
		return "contact";
	}

	
@GetMapping(value="/deletecontact")
	public String deletecontact(@RequestParam("cid") Integer contactId) {
	boolean isDeleted = contactservice.deleteContact(contactId);
	if(isDeleted) {
		return "redirect:/viewcontacts";
	}
	
		return null;
	}

}
