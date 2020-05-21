package unae.lp3.notas.model;

import java.sql.Date;

public class Nota {
	private int id=0;
	private String titulo;
	private String contenido;
	private Date fecha;
	
/*	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	} */
	public Nota(int id, String titulo, String contenido) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.contenido = contenido;
		//this.fecha= new Date.;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	@Override
	public String toString() {
		return "Nota [id=" + id + ", titulo=" + titulo + ", contenido=" + contenido + "]";
	}
		

	
	
}
