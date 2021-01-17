package hosu.in.pic.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import hosu.in.pic.mapper.BoardMapper;
import hosu.in.pic.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class DrawServiceImpl implements DrawService{
	
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList(){
		log.info("getList....");
		
		return mapper.getList();
	}

}
