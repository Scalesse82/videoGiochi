package it.dst.gioco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dst.gioco.model.Categoria;
import it.dst.gioco.model.Gioco;
import it.dst.gioco.model.Pegi;
import it.dst.gioco.repository.GiocoRepository;

@Service
@Transactional
public class GiocoService {

	@Autowired GiocoRepository giocoRepository;
	
	
	public void save(Gioco gioco) {
		giocoRepository.save(gioco);
	}
	
	public List<Gioco> listAll() {
		return (List<Gioco>) giocoRepository.findAll();
	}
	
	public Gioco get(Long id) {
		return giocoRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		giocoRepository.deleteById(id);
	}
	
	
	public List<Gioco> findByCategoriaOrderByPegiDesc(Categoria categoria){
		
		return giocoRepository.findByCategoriaOrderByPegiDesc(categoria);
		
	}
public List<Gioco> findByCategoriaOrderByTitoloDesc(Categoria categoria){
		
		return giocoRepository.findByCategoriaOrderByTitoloDesc(categoria);
		
	}
public List<Gioco> findByCategoriaOrderByPrezzoDesc(Categoria categoria){
	
	return giocoRepository.findByCategoriaOrderByPrezzoDesc(categoria);
	
}

public List<Gioco> findByOrderByPrezzoDesc(){
	
	return giocoRepository.findByOrderByPrezzoDesc();
	
}

public List<Gioco> findByOrderByTitoloDesc(){
	
	return giocoRepository.findByOrderByTitoloDesc();
	
}

public List<Gioco> findByOrderByPegiDesc(){
	
	return giocoRepository.findByOrderByPegiDesc();
	
}
	
}
