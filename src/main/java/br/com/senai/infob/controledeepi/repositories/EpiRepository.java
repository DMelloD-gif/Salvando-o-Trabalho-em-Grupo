package br.com.senai.infob.controledeepi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.infob.controledeepi.models.Epi;

@Repository
public interface EpiRepository extends JpaRepository<Epi, Integer> {

}