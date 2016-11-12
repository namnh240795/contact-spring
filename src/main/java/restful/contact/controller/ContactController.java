package restful.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restful.contact.entity.Contact;
import restful.contact.service.ContactService;

@RestController
public class ContactController {
	@Autowired
	ContactService cs;
	
	@RequestMapping(value="/contactList", method=RequestMethod.GET)
	public String contactList(){
		String list="{" + '\n' ;
	
		List<Contact> listContact = cs.findAll();
		if(!listContact.isEmpty()){
			for (Contact contact : listContact) {
				list+= contact.toString();
				list+='\n';
			}			
		}
		list +=  + '}';
		return list;
	}
	
}
