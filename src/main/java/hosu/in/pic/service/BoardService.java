package hosu.in.pic.service;

import java.util.List;

import hosu.in.pic.vo.BoardVO;

public interface BoardService {
	public abstract List<BoardVO> getList();
	public abstract void writeBoard(BoardVO boardVO);
	Object getCtt(int board_num);
}
