package com.xwx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

	@RequestMapping("top")
	public String dealWithTOP(ModelMap model, HttpServletRequest request, HttpServletResponse response) {

		return "";
	}

	@RequestMapping("foot")
	public String dealWithFoot(ModelMap model, HttpServletRequest request, HttpServletResponse response) {

		return "";
	}

}
