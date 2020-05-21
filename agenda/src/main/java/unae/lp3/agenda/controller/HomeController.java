package unae.lp3.agenda.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import unae.lp3.agenda.model.Nota;



@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET) 
	public String index(Model datos)
	{
		String titulo="index";
		String contenido="soy el contenido de index";
		datos.addAttribute("titulo",titulo);
		datos.addAttribute("contenido",contenido);
		System.out.println("index");
		return "index";
	}
	@RequestMapping(value="dos", method=RequestMethod.GET) 
	public String dos(Model datos)
	{		
		String titulo="dos";
		String contenido="soy el contenido de DOS";
		datos.addAttribute("titulo",titulo);
		datos.addAttribute("contenido",contenido);
		List <Nota> notas= getNotas();
		datos.addAttribute("notas", notas);
		return "dos";
	}
	
	List<Nota> getNotas()
	{
	List<Nota>	lista=null; 
	lista= new LinkedList<>();
	Nota nota1= new Nota(1,"tarea","buscar libros ");
	Nota nota2= new Nota(2,"spring","https://www.baeldung.com/spring-mvc-static-resources");
	Nota nota3= new Nota(3,"otros","otros ");
	lista.add(nota1);
	lista.add(nota2);
	lista.add(nota3);
	return lista;
	}
	
}