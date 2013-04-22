package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Nastan extends Model
{
	public String description;
	public Date fromDate;
	public Date toDate;
	//1 = public, 0 = private;
	public boolean privacy;
	
	@ManyToOne
	public Prostorija prostorija;
}
