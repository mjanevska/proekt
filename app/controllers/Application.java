package controllers;

import play.*;
import play.data.validation.Required;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
	    
    	render();
    }
    
    public static void prostorii()
    {
    	List<Prostorija> prostorii = Prostorija.findAll();
        
        render(prostorii);
    }
    
    public static void fillDatabase()
    {
    	render();
    }
    
    public static void postProstorija(@Required String ime, @Required String zgrada, @Required String kat, @Required String point1X, @Required String point1Y, @Required String point2X, @Required String point2Y)
    {
    	if(validation.hasErrors())
    	{
    		fillDatabase();
    		return;
    	}
    	
    	new Prostorija(ime, zgrada, kat, Integer.parseInt(point1X), Integer.parseInt(point1Y), Integer.parseInt(point2X), Integer.parseInt(point2Y)).save();
    	fillDatabase();
    }
}