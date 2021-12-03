package com.fusion.board1.board;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface BoardService {
	public void insBoard(BoardVO param);
	public List<BoardVO> selBoardList(BoardVO param);
	public BoardVO selBoard(BoardDTO param);
	public void delBoard(BoardVO param);
	public void updBoard(BoardVO param);
	public int selMaxPageVal(BoardDTO param);
	public int updBoardView(BoardVO param);
	public void writeA(BoardVO param, MultipartHttpServletRequest mpRequest);
	public BoardVO selBoardIdx(BoardVO param);
}
