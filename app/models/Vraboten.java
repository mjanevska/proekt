package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

//@Entity
public class Vraboten extends Model
{
	public String ime;
	public String prezime;
	public String EMBG;
	public String telefon;
	public String eMail;
	public String username;
	public String password;
	
	public Vraboten()	{}
}
