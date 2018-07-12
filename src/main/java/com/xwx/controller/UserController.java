package com.xwx.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xwx.model.User;
import com.xwx.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	//设置log
	private static Logger log = Logger.getLogger(UserController.class.getName());
	
	@Autowired
	private UserService userService;
	public UserService getUser() {
		return userService;
	}
	public void setUser(UserService user) {
		userService = user;
	}
	
	@RequestMapping(value="/index", method={RequestMethod.GET})
	public String index(HttpServletRequest request, ModelMap modelMap, @RequestParam(value="name", required=false) String name, @RequestParam(value="page", defaultValue="1") String paramPage){
		
		if(null == paramPage){
			paramPage = "1";
		}
		
		int page = Integer.parseInt(paramPage);
		int pageSize = 3;
		log.debug("name="+name);
		log.debug("page"+page);
		PageHelper.startPage(page, pageSize);
		List<User> u = null;
		if(null !=name && !name.equals("")){
			User user = new User();
			user.setName(name);
			u = userService.selectAll(user);
		} else {
			u = userService.selectAll(null);
		}

		PageInfo<User> pageInfo = new PageInfo<User>(u);
		log.debug(u);
		log.debug(pageInfo);
		modelMap.addAttribute("user", u);
		modelMap.addAttribute("name", name);
		modelMap.addAttribute("pageInfo", pageInfo.getNavigatepageNums());
		return "user/index";
	}
	
	@RequestMapping("/update")
	public String update(int id, HttpServletRequest request){
		User user = userService.getUserById(id);
		request.setAttribute("user", user);
		log.debug(user);
		return "user/update";
	}
	
	@RequestMapping("/doUpdate")
	public String doUpdate(HttpServletRequest request, ModelMap modelMap, @Validated User user, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			List<ObjectError> errors = bindingResult.getAllErrors();
			log.error(bindingResult.getAllErrors().toString());
			modelMap.addAttribute("errors",errors);
			return "user/update";
		}
		userService.updateByPrimaryKey(user);
	    return "redirect:index.do";
	}
	
	@RequestMapping("/add")
	public String add(){
		return "user/add";
	}
	
	@RequestMapping("/doAdd")
	public String doAdd(HttpServletRequest request, ModelMap modelMap, @Validated  User user, BindingResult bindingResult) {
		log.debug(user);
		if(bindingResult.hasErrors()){
			List<ObjectError> errors = bindingResult.getAllErrors();
			log.error(bindingResult.getAllErrors().toString());
			modelMap.addAttribute("errors",errors);
			return "user/add";
		}
		userService.insert(user);
		return "redirect:index.do";
	}
	
	@RequestMapping("/delete")
	public String delete(int id){
		userService.deleteByPrimaryKey(id);
		return "redirect:index.do";
	}
}
