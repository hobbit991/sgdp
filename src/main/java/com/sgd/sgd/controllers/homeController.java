package com.sgd.sgd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sgd.sgd.entities.doctor;
import com.sgd.sgd.entities.doctorando;
import com.sgd.sgd.entities.solicitante;
import com.sgd.sgd.services.doctorServiceImp;
import com.sgd.sgd.services.doctorandoServiceImp;
import com.sgd.sgd.services.programaServiceImp;
import com.sgd.sgd.services.solicitanteServiceImp;
import com.sgd.sgd.services.temaServiceImp;

@Controller
public class homeController {
	@Autowired
	final solicitanteServiceImp solServ;
	final doctorandoServiceImp doctServ;
	final doctorServiceImp docServ;
	final programaServiceImp progServ;
	final temaServiceImp temaServ;

	public homeController(solicitanteServiceImp SolServ, doctorandoServiceImp DoctServ, doctorServiceImp DocServ,
			programaServiceImp ProgServ, temaServiceImp TemaServ) {

		solServ = SolServ;
		doctServ = DoctServ;
		docServ = DocServ;
		progServ = ProgServ;
		temaServ = TemaServ;
	}

	@GetMapping("/calendario")
	public String Calendario() {
		return "calendario";
	}

	@GetMapping("/info")
	public String info() {
		return "acerca";
	}

	@GetMapping("/")
	public String listarSolicitantes(Model model) {

		model.addAttribute("cantSolicitantes", solServ.CantSol());
		model.addAttribute("cantDoctorandos", doctServ.CantDoct());
		model.addAttribute("cantDoctores", docServ.CantDoc());
		model.addAttribute("total", solServ.CantSol() + doctServ.CantDoct() + docServ.CantDoc());
		model.addAttribute("solicitantes", solServ.findAll());
		model.addAttribute("doctorandos", doctServ.findAll());
		model.addAttribute("doctores", docServ.findAll());

		return "index";

	}

	@GetMapping("/estadistica")
	public String estadistica(Model model) {
		model.addAttribute("temas", temaServ.findAll());
		model.addAttribute("cantSolicitantes", solServ.CantSol());
		model.addAttribute("cantDoctorandos", doctServ.CantDoct());
		model.addAttribute("cantDoctores", docServ.CantDoc());
		model.addAttribute("total", solServ.CantSol() + doctServ.CantDoct() + docServ.CantDoc());
		model.addAttribute("solicitantes", solServ.findAll());
		model.addAttribute("doctorandos", doctServ.findAll());
		model.addAttribute("doctores", docServ.findAll());

		return "estadistica";
	}

	@GetMapping("/adddoctor")
	public String showCreateFormDoc(doctor d, Model model) {
		model.addAttribute("temas", temaServ.findAll());
		model.addAttribute("cantSolicitantes", solServ.CantSol());
		model.addAttribute("cantDoctorandos", doctServ.CantDoct());
		model.addAttribute("cantDoctores", docServ.CantDoc());
		model.addAttribute("total", solServ.CantSol() + doctServ.CantDoct() + docServ.CantDoc());
		model.addAttribute("solicitantes", solServ.findAll());
		model.addAttribute("doctorandos", doctServ.findAll());
		model.addAttribute("doctores", docServ.findAll());

		return "addDoctor";
	}

	@PostMapping("/add-doctor")
	public String createDoc(doctor d, BindingResult result, Model model) {

		model.addAttribute("total", solServ.CantSol() + doctServ.CantDoct() + docServ.CantDoc());
		model.addAttribute("solicitantes", solServ.findAll());
		model.addAttribute("doctorandos", doctServ.findAll());
		model.addAttribute("doctores", docServ.findAll());

		if (result.hasErrors()) {
			return "addDoctor";
		}

		docServ.save(d);

		model.addAttribute("doctor", docServ.findAll());

		return "redirect:/";
	}

	@GetMapping("/actualizarDoctor/{id_doctor}")
	public String showUpdateFormDoc(@PathVariable("id_doctor") Long id, Model model) {
		final doctor d = docServ.findById(id);

		model.addAttribute("doctor", d);
		return "editDoctor";
	}

	@RequestMapping("/actualizar-doctorando/{id_doctor}")
	public String updateDoc(@PathVariable("id_doctor") Long id, doctor d, BindingResult result, Model model) {
		if (result.hasErrors()) {
			d.setId_doctor(id);
			return "editDoctor";
		}
		docServ.update(d);
		model.addAttribute("doctor", docServ.findAll());
		return "redirect:/";
	}

	@GetMapping("/adddoctorando")
	public String showCreateFormDoct(doctorando d, Model model) {
		model.addAttribute("cantSolicitantes", solServ.CantSol());
		model.addAttribute("cantDoctorandos", doctServ.CantDoct());
		model.addAttribute("cantDoctores", docServ.CantDoc());
		model.addAttribute("temas", temaServ.findAll());
		model.addAttribute("total", solServ.CantSol() + doctServ.CantDoct() + docServ.CantDoc());
		model.addAttribute("solicitantes", solServ.findAll());
		model.addAttribute("doctorandos", doctServ.findAll());
		model.addAttribute("doctores", docServ.findAll());

		return "addDoctorando";
	}

	@PostMapping("/add-doctorando")
	public String createDoct(doctorando d, BindingResult result, Model model) {
		model.addAttribute("total", solServ.CantSol() + doctServ.CantDoct() + docServ.CantDoc());
		model.addAttribute("solicitantes", solServ.findAll());
		model.addAttribute("doctorandos", doctServ.findAll());
		model.addAttribute("doctores", docServ.findAll());

		if (result.hasErrors()) {
			return "addDoctorando";
		}

		doctServ.save(d);

		model.addAttribute("doctorando", doctServ.findAll());

		return "redirect:/";
	}

	@GetMapping("/actualizarDoctorando/{id_doctorando}")
	public String showUpdateFormDoct(@PathVariable("id_doctorando") Long id, Model model) {
		final doctorando d = doctServ.findById(id);

		model.addAttribute("doctorando", d);
		return "editDoctorando";
	}

	@RequestMapping("/actualizar-doctorando/{id_doctorando}")
	public String updateDoct(@PathVariable("id_doctorando") Long id, doctorando d, BindingResult result, Model model) {
		if (result.hasErrors()) {
			d.setId_doctorando(id);
			return "editDoctorando";
		}
		doctServ.update(d);
		model.addAttribute("doctorando", doctServ.findAll());
		return "redirect:/";
	}

	@GetMapping("/addsolicitante")
	public String showCreateForm(solicitante s, Model model) {
		model.addAttribute("cantSolicitantes", solServ.CantSol());
		model.addAttribute("cantDoctorandos", doctServ.CantDoct());
		model.addAttribute("cantDoctores", docServ.CantDoc());
		model.addAttribute("total", solServ.CantSol() + doctServ.CantDoct() + docServ.CantDoc());
		model.addAttribute("solicitantes", solServ.findAll());
		model.addAttribute("doctorandos", doctServ.findAll());
		model.addAttribute("doctores", docServ.findAll());
		model.addAttribute("programas", progServ.findAll());
		return "addSolicitante";
	}

	@PostMapping("/add-solicitante")
	public String createCategory(solicitante s, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "addSolicitante";
		}

		solServ.save(s);

		model.addAttribute("solicitante", solServ.findAll());

		return "redirect:/";
	}

	@GetMapping(path = { "/buscar_persona" })
	public String buscar_persona(solicitante s, Model model, String keyword) {
		if (keyword != null) {
			List<solicitante> solicitantes = solServ.findBynombre(keyword);
			List<doctorando> doctorandos = doctServ.findBynombre(keyword);
			List<doctor> doctores = docServ.findBynombre(keyword);

			model.addAttribute("solicitantes", solicitantes);
			model.addAttribute("doctorandos", doctorandos);
			model.addAttribute("doctores", doctores);
		} else {
			List<solicitante> solicitantes = solServ.findAll();
			List<doctorando> doctorandos = doctServ.findAll();
			List<doctor> doctores = docServ.findAll();
			model.addAttribute("doctorandos", doctorandos);
			model.addAttribute("doctores", doctores);
			model.addAttribute("solicitantes", solicitantes);
		}

		return "index";
	}

	@GetMapping("/eliminar_solicitante")
	public String delete_solicitante(@RequestParam("id_solicitante") Long id) {

		solServ.deleteById(id);

		return "redirect:/";
	}

	@GetMapping("/eliminar_doctorando")
	public String delete_doctorando(@RequestParam("id_doctorando") Long id) {

		doctServ.deleteById(id);

		return "redirect:/";
	}

	@GetMapping("/eliminar_doctor")
	public String delete_doctor(@RequestParam("id_doctor") Long id) {

		docServ.deleteById(id);

		return "redirect:/";
	}

	@GetMapping("/actualizarSolicitante/{id_solicitante}")
	public String showUpdateForm(@PathVariable("id_solicitante") Long id, Model model) {
		final solicitante s = solServ.findById(id);

		model.addAttribute("solicitante", s);
		return "editSolicitante";
	}

	@RequestMapping("/actualizar-solicitante/{id_solicitante}")
	public String updatePublisher(@PathVariable("id_solicitante") Long id, solicitante s, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			s.setId_solicitante(id);
			return "editSolicitante";
		}
		solServ.update(s);
		model.addAttribute("solicitante", solServ.findAll());
		return "redirect:/";
	}

}
