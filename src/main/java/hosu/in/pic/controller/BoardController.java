package hosu.in.pic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hosu.in.pic.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Controller
@Log4j
public class BoardController {
	
	private BoardService service;
	
	@RequestMapping(value = "/home")
	public String list(Model model) {
		log.info("main board");
		
		model.addAttribute("list", service.getList());
		return "home";
	}
	
}
