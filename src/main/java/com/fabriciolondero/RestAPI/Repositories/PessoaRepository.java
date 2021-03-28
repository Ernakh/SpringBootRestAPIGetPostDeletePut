package com.fabriciolondero.RestAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabriciolondero.RestAPI.Models.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>
{
	
}
