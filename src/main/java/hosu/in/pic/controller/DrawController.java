package hosu.in.pic.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import hosu.in.pic.service.BoardServiceImpl;
import hosu.in.pic.service.DrawServiceImpl;
import hosu.in.pic.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class DrawController {
	
	private static final String SAVE_PATH = "D:\\나의 그림들";
	
	@RequestMapping(value = "/draw")
	public String list(Model model) {
		log.info("my pieces");
		
		return "drawPeed";
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(@RequestParam(value="data") MultipartFile mf, HttpSession session, HttpServletRequest req, HttpServletResponse res) {
		log.info("my pieces");
		
		String originalFileName = mf.getOriginalFilename();
		long fileSize = mf.getSize();
		File targetFile = new File(SAVE_PATH + originalFileName);
		
		System.out.println("파일크기 :" + fileSize);
		
		try {
			InputStream fileStream = mf.getInputStream();
			FileUtils.copyInputStreamToFile(fileStream, targetFile);
		} catch (IOException e) {
			FileUtils.deleteQuietly(targetFile);
			e.printStackTrace();
		}
		
		return "upload";
	}
	
}
