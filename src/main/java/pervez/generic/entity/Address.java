package pervez.generic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	@GeneratedValue
	private int id;
	
	private String firstname;
	private String lastname;
	private String street;
	
	
}
