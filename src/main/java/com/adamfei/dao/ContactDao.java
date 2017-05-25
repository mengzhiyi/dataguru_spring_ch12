package com.adamfei.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.adamfei.entity.Contact;

@Repository("contactDao")
public interface ContactDao {
	
	public int createTable();
	
	public int addContact(Contact contact);
	
	public int deleteContact(Integer id);
	
	public int updateContact(Contact contact);
	
	public List<Contact> getContacts();
	
	public Contact getById(Integer id);
}
