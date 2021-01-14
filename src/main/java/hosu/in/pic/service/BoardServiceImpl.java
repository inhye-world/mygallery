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
public class BoardServiceImpl implements BoardService{
	
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList(){
		log.info("getList....");
		
		return mapper.getList();
	}

	@Override
	public void writeBoard(BoardVO boardVO) {
		log.info("write your story....");
		mapper.insertBoard(boardVO);
	}

	@Override
	public BoardVO getCtt(int board_num) {
		log.info("read your write");
		
		return mapper.getCtt(board_num);
	}
}
