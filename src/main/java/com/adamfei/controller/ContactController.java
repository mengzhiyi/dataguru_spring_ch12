package com.adamfei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.adamfei.entity.Contact;
import com.adamfei.service.IContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private IContactService contactService;
	
	@RequestMapping("/list")
	public ModelAndView getContact(Model model){
		ModelAndView mav = new ModelAndView();
		
		List<Contact> contactList = contactService.getContacts();
		
		mav.addObject("title", "联系人列表");
		mav.addObject("contactList", contactList);
		mav.setViewName("contact/list");
		
		return mav;
	}
	
	@RequestMapping("/save")
	public String addContact(Contact contact){
		if(contact.getId() != 0){
			contactService.updateContact(contact);
		} else {
			contactService.addContact(contact);
		}
		
		return "redirect:/contact/list.do";
	}
	
	@RequestMapping("/preSave")
	public ModelAndView preSave(@RequestParam(value="id", required=false)String id){
		ModelAndView mav = new ModelAndView();
		if(id != null){
			mav.addObject("contact", contactService.getById(Integer.parseInt(id)));
			mav.setViewName("contact/update");
		} else {
			mav.setViewName("contact/add");
		}
		
		return mav;
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="id")int id){
		contactService.deleteContact(id);
		//内部方法，重定向
		return "redirect:/contact/list.do";
	}
}
