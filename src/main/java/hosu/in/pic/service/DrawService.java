package hosu.in.pic.service;

import java.util.List;

import hosu.in.pic.vo.BoardVO;

public interface DrawService {
	public abstract List<BoardVO> getList();
}
