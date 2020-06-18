package unae.lp3.notas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import unae.lp3.notas.model.Categoria;
import unae.lp3.notas.model.Noticia;
import unae.lp3.notas.repository.CategoriasRepo;
import unae.lp3.notas.service.INoticiasService;

@Controller
@RequestMapping(value="noticias")
public class NotciasController {
	@Autowired 
	private INoticiasService servNoti;
	@Autowired 
	private CategoriasRepo caterepo;
	@GetMapping(value="/")	
	public String index(Model datos) 
	{
		String titulo="Todas las Noticias";
		String contenido="soy el contenido de DOS";
		datos.addAttribute("titulo",titulo);
		datos.addAttribute("contenido",contenido);
		List <Noticia> noticias= servNoti.getNoticias();
		datos.addAttribute("datos", noticias);
		return "noticias/index";
	}
	@GetMapping(value="nuevo")
	public String add(Model datos) 
	{
		List<Categoria> categorias= (List<Categoria>) caterepo.findAll();
		datos.addAttribute("categorias",categorias);
		return "noticias/f_new";	
	}
	@PostMapping(value="crear")
	public String create(Noticia noticia) 
	{
		servNoti.saveNoticia(noticia);
		return "redirect:/noticias/";
	}
	@GetMapping(value="editar/{id}")
	public String edit(Model datos, @PathVariable("id") int id) 
	{
		List<Categoria> categorias= (List<Categoria>) caterepo.findAll();
		Noticia noti=servNoti.getNoticia(id);
		datos.addAttribute("noticia",noti);
		datos.addAttribute("categorias",categorias);
		return "noticias/f_edit";	
	}
	@PostMapping(value="actualizar")
	public String update(Noticia noticia) 
	{
		servNoti.saveNoticia(noticia);
		return "redirect:/noticias/";
	}
	@GetMapping(value="borrar/{id}")
	public String destroy(Model datos, @PathVariable("id") int id) 
	{
		servNoti.deleteNoticia(id);
		return "redirect:/noticias/";
		
	}
	
}