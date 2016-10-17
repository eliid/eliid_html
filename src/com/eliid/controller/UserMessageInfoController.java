package com.eliid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eliid.model.UserMessageInfo;
import com.eliid.service.userMessageInfoService;

@Controller
@RequestMapping("/userinfo")
public class UserMessageInfoController {

	@Autowired
	private userMessageInfoService umis;
	
	
	
	@RequestMapping(value="/addUserMessageInfo",method=RequestMethod.POST)
	public ModelAndView addUserMessageInfo(UserMessageInfo info){
		ModelAndView modelAndView = new ModelAndView();
		try {
			boolean result =umis.isAddInfo(info);
			if(result){
				modelAndView.setViewName("redirect:/eliidresouse/eliid.jsp");
				return modelAndView;
				
			}else{
				modelAndView.setViewName("redirect:/eliidresouse/eliid.jsp");
				return modelAndView;
			}
			
		} catch (Exception e) {
			modelAndView.setViewName("redirect:/eliidresouse/eliid.jsp");
			return modelAndView;
		}
	}
}
