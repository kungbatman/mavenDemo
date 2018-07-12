package com.xwx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xwx.dao.EquipmentInformationMapper;
import com.xwx.model.EquipmentInformation;

@Service("equipmentService")
public class EquipmentService {

	@Autowired
	EquipmentInformationMapper equipmentInformationMapper;
	
	/**
	 * 按照主键删除
	 * @param equipment_id
	 * @return
	 */
	
	public int deleteByPrimaryKey (int equipment_id){
	
		return equipmentInformationMapper.deleteByPrimaryKey(equipment_id);
		}
	
	/**
	 * 添加
	 * @param reEquipmentInformation
	 * @return
	 */
	public int insert(EquipmentInformation reEquipmentInformation){
		return equipmentInformationMapper.insert(reEquipmentInformation);
	}
	/**
	 * 非空添加
	 * @param record
	 * @return
	 */
	public int insertSelective(EquipmentInformation record){
		return equipmentInformationMapper.insertSelective(record);
	}
	/**
	 * 按照主机查询
	 * @param equipment_id
	 * @return
	 */
	public EquipmentInformation selectByPrimaryKey(int equipment_id){
		return equipmentInformationMapper.selectByPrimaryKey(equipment_id);
	}

	public int updateByPrimaryKeySelective(EquipmentInformation record){
		
		return equipmentInformationMapper.updateByPrimaryKeySelective(record);
		
	}


	public  int updateByPrimaryKey(EquipmentInformation record){
		return equipmentInformationMapper.updateByPrimaryKey(record);
	}


}
