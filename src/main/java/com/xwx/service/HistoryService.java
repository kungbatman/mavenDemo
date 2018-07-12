package com.xwx.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xwx.dao.HistoricalRecordsMapper;
import com.xwx.model.HistoricalRecords;

@Service("historyService")
public class HistoryService {

	@Autowired
	HistoricalRecordsMapper historicalRecordsMapper;

	public HistoricalRecordsMapper getHistoricalRecordsMapper() {
		return historicalRecordsMapper;
	}

	public void setHistoricalRecordsMapper(HistoricalRecordsMapper historicalRecordsMapper) {
		this.historicalRecordsMapper = historicalRecordsMapper;
	}
	
	
	/**
	 * 按照主键删除
	 * @param recorid_id
	 * @return
	 */
	public int deleteByPrimaryKey(int recorid_id) {

		return historicalRecordsMapper.deleteByPrimaryKey(recorid_id);

	}

	/**
	 * 添加
	 * @param his
	 * @return
	 */
	public int insertHistory(HistoricalRecords his) {
		return historicalRecordsMapper.insert(his);
	}

	/**
	 * 可选添加
	 * @param his
	 * @return
	 */
	public int insertSelective(HistoricalRecords his) {
		return historicalRecordsMapper.insertSelective(his);
	}
	/**
	 * 按照主键查询
	 * @param record_id
	 * @return
	 */
	public HistoricalRecords selectByPrimaryKey(int record_id) {
		return historicalRecordsMapper.selectByPrimaryKey(record_id);
	}
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<HistoricalRecords> selectAll(int area_Id ,int equipmentId ,java.util.Date date ,java.util.Date date2){
		return historicalRecordsMapper.selectAll(area_Id, equipmentId, date, date2);		
	}
	
	public List<HistoricalRecords> selectSelective(int meterNumber,Date time){
	
		return historicalRecordsMapper.selectSelective(meterNumber, time);
	}
	
	
	
	
	
	/**
	 * 更新
	 * @param his
	 * @return
	 */
	public int updateByPrimaryKeySelective(HistoricalRecords his) {

		return historicalRecordsMapper.updateByPrimaryKeySelective(his);
	}
	/**
	 * 按照主键更新
	 * @param his
	 * @return
	 */
	public int updateByPrimaryKey(HistoricalRecords his) {

		return historicalRecordsMapper.updateByPrimaryKey(his);
	}
}
