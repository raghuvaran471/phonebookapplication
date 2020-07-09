package com.raghu.service;

import java.util.List;

import com.raghu.model.Contact;

public interface ContactService {
	
	boolean SaveContact (Contact c);
	List<Contact>getAllcontacts();
	
	
	Contact getContactById(Integer cid);
	boolean updateContact(Contact c);
	boolean deleteContact(Integer cid);
	

}
