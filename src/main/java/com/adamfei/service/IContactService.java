package com.adamfei.service;

import java.util.List;

import com.adamfei.entity.Contact;

public interface IContactService {
	public int createTable();
	
	public int addContact(Contact contact);
	
	public int deleteContact(Integer id);
	
	public int updateContact(Contact contact);
	
	public List<Contact> getContacts();
	
	public Contact getById(Integer id);
}
