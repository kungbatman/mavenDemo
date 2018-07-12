package com.xwx.controller;

import java.nio.channels.FileChannel.MapMode;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.fabric.xmlrpc.base.Data;
import com.xwx.dao.ClassesMapper;
import com.xwx.dao.HistoricalRecordsMapper;
import com.xwx.model.Area;
import com.xwx.model.Classes;
import com.xwx.model.EquipmentInformation;
import com.xwx.model.HeadTeacher;
import com.xwx.model.HistoricalRecords;
import com.xwx.service.HistoryService;

@Controller
@RequestMapping("/history")
public class HistoryController {
	// log
	private static Logger log = Logger.getLogger(HistoryController.class.getName());

	@Autowired
	HistoryService historyService;

	@Autowired
	ClassesMapper classesMapper;

	/**
	 * 按照设备编号id查询一个
	 * 
	 * @param model
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/checkHistory")
	public String checkHistory(ModelMap model, HttpServletRequest request) throws Exception {

		// HistoricalRecords historicalRecords =
		// historyService.selectByPrimaryKey(1);
		//
		// model.addAttribute("historicalRecords", historicalRecords);
		// Area area= historicalRecords.getArea();
		// model.addAttribute(area);

		// System.out.println(historicalRecords.getCumulativeflow());
		// System.out.println(historicalRecords.getInstantaneousflow());
		// System.out.println(historicalRecords.getPositivecumulativeflow());
		// System.out.println(historicalRecords.getState());
		// System.out.println(historicalRecords.getAreanumber());
		// Area area=historicalRecords.getArea();
		// System.out.println(area.getAreaid());
		// EquipmentInformation
		// equipmentInformation=historicalRecords.getEquipmentInformation();
		//
		// System.out.println(equipmentInformation.getEquipmentid());

		/*
		 * Classes classes = classesMapper.selectClassById(1);
		 * 
		 * HeadTeacher headTeacher =classes.getTeacher();
		 * 
		 * @SuppressWarnings("unused") int age =headTeacher.getAge();
		 * 
		 * @SuppressWarnings("unused") int id =headTeacher.getId();
		 * 
		 * @SuppressWarnings("unused") String name =headTeacher.getName();
		 */

		return "history/checkhistory";
	}

	@RequestMapping("/checkAllHistory")
	public String checkAllByTerminal(ModelMap model, HttpServletRequest request)
			throws NumberFormatException, ParseException {
		 Map<String, Object> result = new HashMap<String, Object>();

		// @SuppressWarnings("unchecked")
		 Map<String, String> params = request.getParameterMap();
		// 取出提交的
		@SuppressWarnings("unused")
		String terminalName = (String) request.getParameter("terminalName");

		@SuppressWarnings("unused")
		String area_Id = request.getParameter("area_Id");
		@SuppressWarnings("unused")
		String beginTime = request.getParameter("beginTime");
		@SuppressWarnings("unused")
		String endTime = request.getParameter("endTime");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (beginTime == null || beginTime == "") {
			beginTime = "2017-01-01 01:00:00";
		}
		if (endTime == null || endTime == "") {
			endTime = "2019-01-01 01:00:00";
		}

		List<HistoricalRecords> historicalRecordsList = historyService.selectAll(Integer.parseInt(terminalName),
				Integer.parseInt(area_Id), sdf.parse(beginTime), sdf.parse(endTime));
		
		
		model.addAttribute("historicalRecordsList",historicalRecordsList);
		// @SuppressWarnings("unused")
		// String area_id=params.get("area_Id");
		// @SuppressWarnings("unused")
		// String terminalName = (String)params.get("terminalName");

		// List<HistoricalRecords> manyHistoricalRecords =
		// historyService.selectAll(area_Id, terminalNumber, beginTime,
		// endTime);
		//
		// model.addAttribute("manyHistoricalRecords", manyHistoricalRecords);
		System.out.println("111111111111");
		return "history/showHistoryList";
	}
	@RequestMapping("/test")
	public String test(){
		return "main/main";
		
	}
	
	
}
