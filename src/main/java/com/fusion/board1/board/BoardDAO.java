package com.fusion.board1.board;

import java.util.List;
import java.util.Map;

public interface BoardDAO {
	
	void insBoard(BoardVO param);
	List<BoardVO> selBoardList(BoardVO param);
	BoardVO selBoard(BoardDTO param);
	void delBoard(BoardVO param);
	void updBoard(BoardVO param);
	int selMaxPageVal(BoardDTO param);
	int updBoardView(BoardVO param);
	void insertFile(Map<String, Object>map);
	void writeA(BoardVO param);
	BoardVO selBoardIdx(BoardVO param);
}
