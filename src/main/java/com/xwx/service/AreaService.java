package com.xwx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xwx.dao.AreaMapper;
import com.xwx.model.Area;

@Service("areaService")
public class AreaService {

	@Autowired
	AreaMapper areaMapper;

	/**
	 * 按照逐漸刪除
	 * @param areaid
	 * @return
	 */
	public int deleteByPrimaryKey(int areaid) {

		return areaMapper.deleteByPrimaryKey(areaid);
	}
/**
 * 添加地區
 * @param record
 * @return
 */
	public int insert(Area record) {

		return areaMapper.insert(record);
	}

	/**
	 * 添加可選地區
	 * @param area
	 * @return
	 */
	public int insertSelective(Area area) {

		return areaMapper.insertSelective(area);
	}

	/**
	 * 查询
	 * @param areaid
	 * @return
	 */
	public Area selectByPrimaryKey(int areaid) {

		return areaMapper.selectByPrimaryKey(areaid);
	}
	/**
	 * 更新
	 * @param area_id
	 * @return
	 */
	public int updateByPrimaryKeySelective(Area area_id) {

		return areaMapper.updateByPrimaryKeySelective(area_id);
	}
	/**
	 * 更新2
	 * @param record
	 * @return
	 */
	public int updateByPrimaryKey(Area record) {

		return areaMapper.updateByPrimaryKey(record);
	}

}
