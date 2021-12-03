package com.fusion.board1.board;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardDAOService")
public class BoardDAOService implements BoardDAO {
	  @Autowired
	    private SqlSession sqlSession;
	  
	  public void insBoard(BoardVO param){
	        BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	        mapper.insBoard(param);
	    }
	  
	  public void insertFile(Map<String, Object> map) {
		  sqlSession.insert("boardMapper.insertFile", map);
	  }
	  
	  public void writeA(BoardVO param) {
		  BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	        mapper.insBoard(param);
	  }
	  
	  public List<BoardVO> selBoardList(BoardVO param){
	        BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	        return mapper.selBoardList(param);
	    }
	  
	  public BoardVO selBoard(BoardDTO param) {
		  BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	      return mapper.selBoard(param);
	  }
	  
	  public void delBoard(BoardVO param) {
		  BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	       mapper.delBoard(param);
	  }
	  
	  public void updBoard(BoardVO param) {
		  BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	       mapper.updBoard(param);
	  }
	  
	  public int selMaxPageVal(BoardDTO param) {
		  BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	      return mapper.selMaxPageVal(param);
	  }
	  
	  public int updBoardView(BoardVO param) {
		  BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	      return mapper.updBoardView(param);
	  }
	  
	  public BoardVO selBoardIdx(BoardVO param) {
		  BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	      return mapper.selBoardIdx(param);
	  }
	  
	  
	  
	  
}
