package com.raghu.service.impl;

import java.util.ArrayList;
import java.util.List;
/*import java.util.stream.Collectors;*/
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghu.Repository.ContactdltsRepo;
import com.raghu.entity.EntityContact;
import com.raghu.model.Contact;
import com.raghu.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactdltsRepo contactRepo;

		

	@Override
	public boolean SaveContact(Contact c) {
		EntityContact entity=new EntityContact();
	BeanUtils.copyProperties(c, entity);
		EntityContact savedEntity = contactRepo.save(entity);
		return savedEntity.getContactId() !=null;
	}

	@Override
	public List<Contact> getAllcontacts() {
		List<EntityContact> entities = contactRepo.findAll();
		List<Contact> contacts= new ArrayList<Contact>();
		
		for(EntityContact entity:entities) {
			Contact contact= new Contact();
		BeanUtils.copyProperties(entity, contact);
	contacts.add(contact);
		}
	
		/*List<Contact> contacts=entities.stream().map(entity->{ 
		Contact contact= new Contact();
		BeanUtils.copyProperties(entity, contact);
	}).collect(Collectors.toList());*/
		return contacts;
	}

	@Override
	public Contact getContactById(Integer cid) {
		Optional<EntityContact> findById = contactRepo.findById(cid);
		if(findById.isPresent()) {
			EntityContact entity= new EntityContact();
			Contact c=new Contact();
			BeanUtils.copyProperties(entity, c);
			return c;
		}
		
		return null;
	}

	@Override
	public boolean updateContact(Contact c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		contactRepo.deleteById(cid);
		
		return true;
	}

}
