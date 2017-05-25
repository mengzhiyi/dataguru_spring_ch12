package com.adamfei.test.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adamfei.entity.Contact;
import com.adamfei.service.IContactService;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/spring-application.xml"})
public class ContactServiceTest extends TestCase {

	private Logger logger = Logger.getLogger(ContactServiceTest.class);
	
	@Autowired
	private IContactService contactService;
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testAdd(){
		Contact c = new Contact();
		c.setName("张三");
		c.setEmail("zhangsan@163.com");
		c.setAddress("山东省烟台市");
		c.setTelephone("18888888888");
		
		int result = contactService.addContact(c);
		logger.info("添加成功 " + result + " 条记录");
	}

	@Test
	public void testDelete(){
		int result = contactService.deleteContact(1);
		logger.info("删除成功 " + result + " 条记录");
	}
	
	@Test
	public void testUpdate(){
		Contact c = new Contact();
		c.setId(1);
		c.setName("张三2");
		c.setEmail("zhangsan@163.com");
		c.setAddress("山东省烟台市");
		c.setTelephone("18888889999");
		int result = contactService.updateContact(c);
		logger.info("更新成功 " + result + " 条记录");
	}
	
	@Test 
	public void testGet(){
		List<Contact> contacts = contactService.getContacts();
		logger.info("获取到 " + contacts.size() + "条记录");
		for(Contact c: contacts){
			logger.info(c);
		}
	}
	
	@Test
	public void testGetById(){
		Contact c = contactService.getById(2);
		logger.info(c);
	}
}
