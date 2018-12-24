package com.bridgeit.employeeapp;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EmployeeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/login")
	public String display(Model m) {
		m.addAttribute("emp", new Employee());
		return "login";
	}

	@RequestMapping(value = "/homepage")
	public String submitForm(@Valid @ModelAttribute("emp") Employee e, BindingResult br) {
		if (br.hasErrors()) {
			return "login";
		} else {
			return "homepage";
		}
	}

}
