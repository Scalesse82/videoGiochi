package it.dst.gioco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dst.gioco.model.Categoria;
import it.dst.gioco.model.Gioco;
import it.dst.gioco.service.GiocoService;

@Controller
public class GiocoController {

	@Autowired
	private GiocoService service;

	@RequestMapping("/")
	public ModelAndView home() {
		List<Gioco> lista = service.listAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("lista", lista);
		return mav;
	}

	@RequestMapping("/new")
	public String newGiocoForm(Model model) {
		Gioco gioco = new Gioco();
		model.addAttribute("gioco", gioco);
		return "aggiungi_gioco";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveGioco(@ModelAttribute("gioco") Gioco gioco) {
		service.save(gioco);
		return "redirect:/";
	}

	@RequestMapping("/modifica")
	public ModelAndView editGiocoForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("modifica_gioco");
		Gioco gioco = service.get(id);
		mav.addObject("gioco", gioco);

		return mav;
	}

	@RequestMapping("/elimina")
	public String deleteGiocoForm(@RequestParam long id) {
		service.delete(id);
		return "redirect:/";
	}

	@RequestMapping(value = "/indietro", method = RequestMethod.POST)
	public String indietro() {
		return "redirect:/";
	}

	@RequestMapping("/filtra")
	public ModelAndView filta(@RequestParam("categoria") int cat, @RequestParam("field") int field) {

		List<Gioco> lista = null;
		
		
		switch (cat) {
		case 0:
			switch (field) {
			case 0:
				lista = service.findByCategoriaOrderByTitoloDesc(Categoria.HORROR);

				break;
			case 1:
				lista = service.findByCategoriaOrderByPegiDesc(Categoria.HORROR);

				break;
			case 2:
				lista = service.findByCategoriaOrderByPrezzoDesc(Categoria.HORROR);

				break;
			}

			break;

		case 1:
			switch (field) {
			case 0:
				lista = service.findByCategoriaOrderByTitoloDesc(Categoria.SPORT);

				break;
			case 1:
				lista = service.findByCategoriaOrderByPegiDesc(Categoria.SPORT);

				break;
			case 2:
				lista = service.findByCategoriaOrderByPrezzoDesc(Categoria.SPORT);

				break;
			}

			break;
		case 2:
			switch (field) {
			case 0:
				lista = service.findByCategoriaOrderByTitoloDesc(Categoria.FPS);

				break;
			case 1:
				lista = service.findByCategoriaOrderByPegiDesc(Categoria.FPS);

				break;
			case 2:
				lista = service.findByCategoriaOrderByPrezzoDesc(Categoria.FPS);

				break;
			}

			break;
		case 3:
			switch (field) {
			case 0:
				lista = service.findByCategoriaOrderByTitoloDesc(Categoria.ACTION);

				break;
			case 1:
				lista = service.findByCategoriaOrderByPegiDesc(Categoria.ACTION);

				break;
			case 2:
				lista = service.findByCategoriaOrderByPrezzoDesc(Categoria.ACTION);

				break;
			}

			break;
		case 4:
			switch (field) {
			case 0:
				lista = service.findByCategoriaOrderByTitoloDesc(Categoria.RPG);

				break;
			case 1:
				lista = service.findByCategoriaOrderByPegiDesc(Categoria.RPG);

				break;
			case 2:
				lista = service.findByCategoriaOrderByPrezzoDesc(Categoria.RPG);

				break;
			}

			break;
		case 5:
			switch (field) {
			case 0:
				lista = service.findByOrderByTitoloDesc();

				break;
			case 1:
				lista = service.findByOrderByPegiDesc();

				break;
			case 2:
				lista = service.findByOrderByPrezzoDesc();

				break;
			}

			break;
		}

		for (Gioco gioco : lista) {

			System.out.println(gioco.getId());
		}

		ModelAndView mav = new ModelAndView("mostra_filtro");
		mav.addObject("lista", lista);
		return mav;
	}

}
