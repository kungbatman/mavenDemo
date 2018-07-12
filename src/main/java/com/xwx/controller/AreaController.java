package com.xwx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xwx.dao.AreaMapper;
import com.xwx.model.Area;
import com.xwx.service.AreaService;
import com.xwx.service.HistoryService;

@Controller
@RequestMapping("/area")
public class AreaController {
	
	@Autowired
	AreaService areaService;
	
	
	@RequestMapping("/checkArea")
	public String checkArea(){
		
		
		Area area=areaService.selectByPrimaryKey(1);
		
		
		System.out.println(area);
		
		
		return "area/checkArea";
	}

	
	
}
