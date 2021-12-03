package com.fusion.board1.board;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fusion.board1.user.UserMapper;
import com.fusion.board1.user.UserVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Resource(name="fileUtils")
	private FileUtils fileUtils;
	@Autowired
	private BoardDAO boardDAOService;
	
	 @Override
	    public void insBoard(BoardVO param){
	        boardDAOService.insBoard(param);
	    }
	 
	 @Override
	 	public void writeA(BoardVO param, MultipartHttpServletRequest mpRequest){
		 //boardDAOService.writeA(param);
		 List<Map<String, Object>> list;
		try {
			list = fileUtils.parseInsertFileInfo(param, mpRequest);
			int size = list.size();
			for(int i=0; i<size; i++) {
				boardDAOService.insertFile(list.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 
	  @Override
	    public List<BoardVO> selBoardList(BoardVO param){
		  int startIdx = (param.getPage() -1) * param.getRecordCnt();
		  param.setStartIdx(startIdx);
	        List<BoardVO> list = null;
	        list = boardDAOService.selBoardList(param);
	        return list;
	    }
	  @Override
	    public BoardVO selBoard(BoardDTO param){
	        return boardDAOService.selBoard(param);
	    }
	  
	  @Override
	    public void delBoard(BoardVO param){
	        boardDAOService.delBoard(param);
	    }
	  
	  @Override
	  public void updBoard(BoardVO param) {
		  boardDAOService.updBoard(param);
	  }
	  
	  
	  @Override
	  public int selMaxPageVal(BoardDTO param) {
		  return boardDAOService.selMaxPageVal(param);
	  }
	  
	  @Override
	  public int updBoardView(BoardVO param) {
		  return boardDAOService.updBoardView(param);
	  }
	  
	  @Override
	  public BoardVO selBoardIdx(BoardVO param) {
		  return boardDAOService.selBoardIdx(param);
	  }
	  
	  
	
}
