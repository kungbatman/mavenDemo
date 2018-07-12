package com.xwx.dao;

import com.xwx.model.EquipmentInformation;

public interface EquipmentInformationMapper {
	
	
    int deleteByPrimaryKey(Integer equipmentid);

    int insert(EquipmentInformation record);

    int insertSelective(EquipmentInformation record);

    EquipmentInformation selectByPrimaryKey(Integer equipmentid);

    int updateByPrimaryKeySelective(EquipmentInformation record);

    int updateByPrimaryKey(EquipmentInformation record);
}