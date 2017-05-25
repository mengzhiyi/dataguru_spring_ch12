package com.adamfei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adamfei.dao.ContactDao;
import com.adamfei.entity.Contact;
import com.adamfei.service.IContactService;


@Service("ContactService")
public class ContactService implements IContactService {

	@Autowired
	private ContactDao contactDao;
	
	@Override
	public int addContact(Contact contact) {
		return contactDao.addContact(contact);
	}

	@Override
	public int deleteContact(Integer id) {
		return contactDao.deleteContact(id);
	}

	@Override
	public int updateContact(Contact contact) {
		return contactDao.updateContact(contact);
	}

	@Override
	public List<Contact> getContacts() {
		return contactDao.getContacts();
	}

	@Override
	public int createTable() {
		return contactDao.createTable();
	}

	@Override
	public Contact getById(Integer id) {
		return contactDao.getById(id);
	}

}
