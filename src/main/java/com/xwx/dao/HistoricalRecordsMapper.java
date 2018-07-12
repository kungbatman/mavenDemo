package com.xwx.dao;

import java.sql.Date;
import java.util.List;

import com.xwx.model.HistoricalRecords;

public interface HistoricalRecordsMapper {

	int deleteByPrimaryKey(Integer recordid);

	int insert(HistoricalRecords record);

	int insertSelective(HistoricalRecords record);

	HistoricalRecords selectByPrimaryKey(Integer recordid);

	int updateByPrimaryKeySelective(HistoricalRecords record);

	int updateByPrimaryKey(HistoricalRecords record);

	List<HistoricalRecords> selectAll(Integer area_Id, Integer equipmentId, java.util.Date date, java.util.Date date2);

	List<HistoricalRecords> selectSelective(int meterNumber, Date time);

}