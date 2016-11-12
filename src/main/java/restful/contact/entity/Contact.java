package restful.contact.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;


@Entity
@Table(name = "contact")

public class Contact {
	@Id
	@Column(name = "student_id", nullable = true, length = 10)
	private String student_id;
	@Column(name = "name", nullable = true, length = 50)
	private String name;
	@Column(name = "class", nullable = true, length = 5)
	private String clas;
	@Column(name = "phone", nullable = true, length = 11)
	private String phone;
	@Column(name = "email", nullable = true, length = 60)
	private String email;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(String student_id, String name, String clas, String phone, String email) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.clas = clas;
		this.phone = phone;
		this.email = email;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@OrderBy(value="student_id ASC")
    private List<Contact> contact;
	
	@Override
	public String toString(){
		return "{ student_id= " + student_id +
				", name=" + name + 
				", class=" + clas +
				", phone=" + phone +
				", email=" + email +
				"}";
	}
}