package com.adan.valorantteams.entity.services;

import java.util.List;

import com.adan.valorantteams.entity.models.ValorantTeam;

public interface IValorantTeamService {
	public List<ValorantTeam> getAll();
	public ValorantTeam getOne(long id);
	public void add(ValorantTeam valorantTeam);
	public void modify(ValorantTeam valorantTeam, long id);
	public void delete(long id);
}
