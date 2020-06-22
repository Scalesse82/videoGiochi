package it.dst.gioco.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.dst.gioco.model.Categoria;
import it.dst.gioco.model.Gioco;
import it.dst.gioco.model.Pegi;


public interface GiocoRepository extends CrudRepository<Gioco, Long> {
	
	
	public List<Gioco> findByCategoriaOrderByPegiDesc(Categoria categoria);
	
	public List<Gioco> findByCategoriaOrderByTitoloDesc(Categoria categoria);

	public List<Gioco> findByCategoriaOrderByPrezzoDesc(Categoria categoria);

	public List<Gioco> findByOrderByPrezzoDesc();
	
	public List<Gioco> findByOrderByTitoloDesc();
	
	public List<Gioco> findByOrderByPegiDesc();




}
