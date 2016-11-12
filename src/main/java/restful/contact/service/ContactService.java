package restful.contact.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.parser.OrderBySource;
import org.springframework.stereotype.Service;

import restful.contact.entity.Contact;
import restful.contact.repository.ContactRepository;
@Service
public class ContactService {
	@PersistenceContext
    private EntityManager em;
	@Autowired
	private ContactRepository cr;
	public ContactService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Contact> findAll(){
		return cr.findAll();
	}
	public List<Contact> findAllOrderByStudentId(){
		return cr.findAll(new OrderBySource("student_idasc").toSort());
	}
	public List<Contact> findById(String student_id){
		
		StringBuilder sql = new StringBuilder();
		String sqlString = "";
		sql.append(" SELECT ");
		sql.append(" 	* ");
		sql.append(" FROM ");
		sql.append(" 	contact ");
		sql.append(" WHERE ");
		sql.append(" 	student_id = :student_id ");
		sqlString = sql.toString();
		
			Query query = em.createNativeQuery(sqlString, Contact.class);
			query.setParameter("student_id", student_id);
			@SuppressWarnings("unchecked")
			List<Contact> rs = query.getResultList();
			
			return rs;
		
	}
}
