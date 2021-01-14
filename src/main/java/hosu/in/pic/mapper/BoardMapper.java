package hosu.in.pic.mapper;

import java.util.List;

import hosu.in.pic.vo.BoardVO;

public interface BoardMapper {
	public List<BoardVO> getList();

	public void insertBoard(BoardVO boardVO);

	public BoardVO getCtt(int board_num);

	public void delete(int board_num);
}
