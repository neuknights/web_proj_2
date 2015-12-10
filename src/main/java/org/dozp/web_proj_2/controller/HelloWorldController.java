package org.dozp.web_proj_2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC!";
 
//	@RequestMapping("/hello")
//	public ModelAndView showMessage(
//			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
//		System.out.println("in controller");
// 
//		ModelAndView mv = new ModelAndView("helloworld");
//		mv.addObject("message", message);
//		mv.addObject("name", name);
//		return mv;
//	}
	
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		Map<String,Object> map = new HashMap<String,Object>(); 
		if(name.equals("dzp"))
		{
			System.out.println("成功");
			map.put("msg", "成功");
		}else{  
            System.out.println("失败");  
            map.put("msg", "失败");  
        }  

		return map;
	}
}
