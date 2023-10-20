package com.adan.valorantteams.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adan.valorantteams.entity.dao.IValorantTeamDao;
import com.adan.valorantteams.entity.models.ValorantTeam;

@Service
public class ValorantTeamServiceImpl implements IValorantTeamService{

	@Autowired
	private IValorantTeamDao valorantTeamDao;
	
	@Override
	public List<ValorantTeam> getAll() {
		return (List<ValorantTeam>)valorantTeamDao.findAll();
	}

	@Override
	public ValorantTeam getOne(long id) {
		return valorantTeamDao.findById(id).get();
	}

	@Override
	public void add(ValorantTeam valorantTeam) {
		valorantTeamDao.save(valorantTeam);
	}

	@Override
	public void modify(ValorantTeam valorantTeam, long id) {
		valorantTeamDao.findById(id).ifPresent((x)->{
			valorantTeam.setId(id);
			valorantTeamDao.save(valorantTeam);
		});
		
	}

	@Override
	public void delete(long id) {
		valorantTeamDao.deleteById(id);
		
	}
	
	
	
	
	
}
