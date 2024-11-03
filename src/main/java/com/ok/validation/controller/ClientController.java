package com.ok.validation.controller;

import com.ok.validation.model.Client;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@GetMapping("/client")
	public String showClientForm(Model model) {

		model.addAttribute("client", new Client());
		return "client-form";
	}

	@PostMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("client") Client client,
	                          BindingResult bindingResult, Model model) {


		if (bindingResult.hasErrors()) {
			return "client-form";
		} else {
			return "client-confirmation";
		}
	}
}
