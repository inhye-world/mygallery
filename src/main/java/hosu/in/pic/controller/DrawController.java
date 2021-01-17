package hosu.in.pic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hosu.in.pic.service.BoardServiceImpl;
import hosu.in.pic.service.DrawServiceImpl;
import hosu.in.pic.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Controller
@Log4j
public class DrawController {
	
	private DrawServiceImpl service;
	
	@RequestMapping(value = "/draw")
	public String list(Model model) {
		log.info("my pieces");
		
		return "drawPeed";
	}
	
}
