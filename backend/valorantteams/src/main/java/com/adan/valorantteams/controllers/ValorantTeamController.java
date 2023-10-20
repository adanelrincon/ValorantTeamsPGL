package com.adan.valorantteams.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adan.valorantteams.entity.models.ValorantTeam;
import com.adan.valorantteams.entity.services.IValorantTeamService;

@CrossOrigin(origins = "*")
@RestController
public class ValorantTeamController {

	@Autowired
	private IValorantTeamService valorantTeamService;
	
	@GetMapping("/teams")
	public List<ValorantTeam> getAll(){
		return valorantTeamService.getAll();
	}
	
	@GetMapping("/teams/{id}")
	public ValorantTeam getOne(@PathVariable(value = "id") long id){
		return valorantTeamService.getOne(id);
	}
	
	@PostMapping("/teams")
	public void addTeam(ValorantTeam team) {
		valorantTeamService.add(team);
	}
	//Hola
	@PutMapping("/teams/{id}")
	public void modifyTeam(ValorantTeam team, @PathVariable(value = "id") long id) {
		valorantTeamService.modify(team, id);
	}
	
	
	@DeleteMapping("/teams/{id}")
	public void deleteTeam(@PathVariable(value = "id") long id) {
		valorantTeamService.delete(id);
	}
}
