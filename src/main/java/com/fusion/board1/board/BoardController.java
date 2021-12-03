package com.fusion.board1.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fusion.board1.user.UserService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String list(@ModelAttribute("boardVO") BoardVO param, Model model) {
		 List<BoardVO> list = service.selBoardList(param);
		 model.addAttribute("list", list);
		 int maxPageVal = service.selMaxPageVal(param);
		 model.addAttribute("maxPageVal", maxPageVal);
		 return "board/list";
	}
	
	@RequestMapping(value="/list", method = RequestMethod.POST)
		public String listForm(BoardVO param, Model model, HttpServletRequest req) { 		
			List<BoardVO> list = service.selBoardList(param);
			model.addAttribute("list", list);
			String searchText = req.getParameter("searchText");
			model.addAttribute("searchText", searchText);
			return "board/list";
	}
	
	@RequestMapping(value="listA")
		public String listA(BoardVO param, Model model) {
		return "board/listA";
	}
	
	@RequestMapping(value="listB")
	public String listB(BoardVO param, Model model) {
	return "board/listB";
}
	
	@RequestMapping(value="/write", method = RequestMethod.GET)
		public String write() {
			return "board/write";
		}
	
	@RequestMapping(value="/write", method = RequestMethod.POST)
	    public String write(@ModelAttribute("boardVO") BoardVO param, Model model){
	        service.insBoard(param);
	        return "board/writeSuccess";
	    }
	
	@RequestMapping(value="/writeA")
		public String writeA() {
			return "board/writeA";
	}
	
	@RequestMapping(value="/writeA", method = RequestMethod.POST)
		public String writeFormA(BoardVO param, MultipartHttpServletRequest mpRequest, Model model) {
			service.insBoard(param);
			BoardVO selBoardIdx = service.selBoardIdx(param);
			param.setIboard(selBoardIdx.getIboard());
			service.writeA(param, mpRequest);
			return "board/writeSuccessA";
	}
	
	@RequestMapping(value="/writeSuccess", method = RequestMethod.GET)
		public String writeSuccess() {
		return "board/writeSuccess";
		}
	
	@RequestMapping("/detail")
    public String detail(BoardDTO param, Model model){
        System.out.println("iboard : " + param.getIboard());
        BoardVO data = service.selBoard(param);
        model.addAttribute("data", data);
//        service.updBoardView(param1);
        return"board/detail";
    }
	
	@RequestMapping(value="/mod", method = RequestMethod.GET)
	public void mod(BoardDTO param, Model model) {
		model.addAttribute("data", service.selBoard(param));
	}
	
	@RequestMapping(value="/mod", method = RequestMethod.POST)
	public String mod(BoardVO param, Model model, HttpServletRequest request) {
		service.updBoard(param);
//		int iboard = (request.getParameter("iboard");
		return "redirect:list";
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public String delete(BoardVO param) {
		service.delBoard(param);
		return "redirect:list";
	}
	
	
	
}
