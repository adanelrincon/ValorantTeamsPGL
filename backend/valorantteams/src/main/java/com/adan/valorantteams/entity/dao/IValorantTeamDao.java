package com.adan.valorantteams.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.adan.valorantteams.entity.models.ValorantTeam;

public interface IValorantTeamDao extends CrudRepository<ValorantTeam, Long> {

}
