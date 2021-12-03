package com.fusion.board1.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
  public void insBoard(BoardVO param);
  public List<BoardVO> selBoardList(BoardVO param);
  public BoardVO selBoard(BoardDTO param);
  public void delBoard(BoardVO param);
  public void updBoard(BoardVO param);
  public int selMaxPageVal(BoardDTO param);
  public int updBoardView(BoardVO param);
  public BoardVO selBoardIdx(BoardVO param);
}
