package com.fusion.board1.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(@RequestParam(value="err",defaultValue="0") int err, Model model){
		System.out.println("err: " + err);
		switch (err){
        case 1: //아이디 없음
            model.addAttribute("errMsg","아이디를 확인해주세요.");
            break;
        case 2: //비밀번호 틀림
            model.addAttribute("errMsg", "비밀번호를 확인해주세요.");
            break;
    }
		return "user/login";
	}
	
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public String join() {
		return "user/join";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(UserVO param) {
		return "redirect:" + service.login(param);
	}
	
	@RequestMapping(value="/join", method = RequestMethod.POST)
	public String join(UserVO param) {
		service.join(param);
		return "redirect:/user/login";
	}
	
	@ResponseBody
	@RequestMapping(value="/idChk", method= RequestMethod.GET)
	public Map<String, Object> idChk(UserVO param){
		System.out.println(param.getId());
		Map<String, Object> data = new HashMap<>();
		data.put("result", service.idChk(param));
		System.out.println(data);
		return data;
	}
	
	@RequestMapping(value="/logout", method= RequestMethod.GET)
	    public String logout(HttpSession hs, HttpServletRequest req){
	        hs.invalidate();
	        return "redirect:/";
	       // return "redirect:/board/list";
	    }
	
}
