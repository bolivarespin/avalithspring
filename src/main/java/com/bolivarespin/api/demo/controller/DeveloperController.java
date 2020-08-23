package com.bolivarespin.api.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bolivarespin.api.demo.model.Developer;

@RestController
public class DeveloperController {

	List<Developer> listDevelopers = new ArrayList<>();

	@GetMapping("/developers")
	public List<Developer> getDevelopers() {
		return this.listDevelopers;
	}

	@PostMapping("/developers")
	public String storeDeveloper(@RequestParam("id") int id, @RequestParam("nombres_completos") String nombresCompletos,
			@RequestParam("link_github") String linkGithub,
			@RequestParam("tecnologias_conocidas") String tecnologiasManejadas) {
		Developer developer = new Developer();
		developer.setId(id);
		developer.setNombres_completos(nombresCompletos);
		developer.setLink_github(linkGithub);
		developer.setTecnologias_manejadas(tecnologiasManejadas);
		this.listDevelopers.add(developer);
		return "Agregado a la lista";
	}

	@PutMapping("/developers/{id}")
	public String updateDeveloper(@PathVariable("id") int id,
			@RequestParam("nombres_completos") String nombresCompletos, @RequestParam("link_github") String linkGithub,
			@RequestParam("tecnologias_conocidas") String tecnologiasManejadas) {
		Developer developerSearch = new Developer();
		developerSearch = this.getDeveloperSearching(id);
		
		if (null != developerSearch) {
			developerSearch.setNombres_completos(nombresCompletos);
			developerSearch.setLink_github(linkGithub);
			developerSearch.setTecnologias_manejadas(tecnologiasManejadas);
			return "Developer Modificado";
		}
		return "No se encontró el developer buscado";
	}

	@DeleteMapping("/developers/{id}")
	public String deleteDevelopers(@PathVariable("id") int id) {
		Developer developerSearch = new Developer();
		developerSearch = this.getDeveloperSearching(id);
		
		if (null != developerSearch) {
			listDevelopers.remove(developerSearch);
			return "Developer Eliminado";
		}
		return "No se encontró el developer buscado";
	}
	
	private Developer getDeveloperSearching(int id) {
		Developer developerSearch = new Developer();
		for (Developer developer : listDevelopers) {
			if (id == developer.getId()) {
				developerSearch = developer;
			}
		}
		if (null != developerSearch.getId()) {
			return developerSearch;
		}
		return null;
	}
}
