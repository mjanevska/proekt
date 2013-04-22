package models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

//@Entity
public class Student extends Model
{
	public String ime;
	public String prezime;
	public String EMBG;
	public String eMail;
	public String username;
	public String password;
	
//	@OneToMany
//	public GrupaStudenti grupa;
	
	public Student()	{}	
}
