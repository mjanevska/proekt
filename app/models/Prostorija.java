package models;

import java.awt.Point;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Prostorija extends Model
{
	public String ime;
	public String zgrada;
	public String kat;
	public Point point1;
	public Point point2;
	
	public Prostorija(){}
	
	public Prostorija(String ime, String zgrada, String kat, int point1X, int point1Y, int point2X, int point2Y)
	{
		this.ime = ime;
		this.zgrada = zgrada;
		this.kat = kat;
		this.point1 = new Point(point1X, point1Y);
		this.point2 = new Point(point2X, point2Y);
	}
	
}
