package hosu.in.pic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hosu.in.pic.service.BoardServiceImpl;
import hosu.in.pic.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Controller
@Log4j
public class BoardController {
	
	private BoardServiceImpl service;
	
	@RequestMapping(value = "/home")
	public String list(Model model) {
		log.info("main board");
		
		model.addAttribute("list", service.getList());
		return "home";
	}
	
	@RequestMapping(value = "/content")
	public String content(BoardVO boardVO, Model model) {
		log.info("board content");
		
		model.addAttribute("content", service.getCtt(boardVO.getBoard_num()));
		return "myContent";
	}
	
	@RequestMapping(value = "/write_view")
	public String writePage(Model model) {
		log.info("write your peed");
		
		return "writePeed";
	}
	
	@RequestMapping(value = "/boardWrite")
	public String write(BoardVO boardVO) throws Exception{
		log.info("write doooowwwwn");
		
		service.writeBoard(boardVO);
		return "redirect:home";
	}
	
	@RequestMapping(value = "/delete")
	public String delete(BoardVO boardVO){
		log.info("delete this shit");
		
		service.remove(boardVO.getBoard_num());
		return "redirect:home";
	}
	
}
