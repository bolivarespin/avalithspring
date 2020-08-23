package com.bolivarespin.api.demo.model;


public class Developer {
	private Integer id;
	private String nombres_completos;
	private String link_github;
	private String tecnologias_manejadas;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombres_completos() {
		return nombres_completos;
	}
	public void setNombres_completos(String nombres_completos) {
		this.nombres_completos = nombres_completos;
	}
	public String getLink_github() {
		return link_github;
	}
	public void setLink_github(String link_github) {
		this.link_github = link_github;
	}
	public String getTecnologias_manejadas() {
		return tecnologias_manejadas;
	}
	public void setTecnologias_manejadas(String tecnologias_manejadas) {
		this.tecnologias_manejadas = tecnologias_manejadas;
	}
	@Override
	public String toString() {
		return "Developer [id=" + id + ", nombres_completos=" + nombres_completos + ", link_github=" + link_github
				+ ", tecnologias_manejadas=" + tecnologias_manejadas + "]";
	}
	
}
