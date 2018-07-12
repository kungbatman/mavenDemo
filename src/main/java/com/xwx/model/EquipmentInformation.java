package com.xwx.model;

import java.util.List;

public class EquipmentInformation {
    private Integer equipmentid;

    private Integer equipmentnumber;

    private Integer equipmenttype;

    private Integer cal;

    private Integer equipmentstate;

    private String remark;

//    private Integer areaAreaid;
//    地址引用
    private Area area;
    
    private List<HistoricalRecords> historicalRecords;
    
    
    
    
    
    
    
    public List<HistoricalRecords> getHistoricalRecords() {
		return historicalRecords;
	}

	public void setHistoricalRecords(List<HistoricalRecords> historicalRecords) {
		this.historicalRecords = historicalRecords;
	}

	
	
	
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	
	
	
	public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    public Integer getEquipmentnumber() {
        return equipmentnumber;
    }

    public void setEquipmentnumber(Integer equipmentnumber) {
        this.equipmentnumber = equipmentnumber;
    }

    public Integer getEquipmenttype() {
        return equipmenttype;
    }

    public void setEquipmenttype(Integer equipmenttype) {
        this.equipmenttype = equipmenttype;
    }

    public Integer getCal() {
        return cal;
    }

    public void setCal(Integer cal) {
        this.cal = cal;
    }

    public Integer getEquipmentstate() {
        return equipmentstate;
    }

    public void setEquipmentstate(Integer equipmentstate) {
        this.equipmentstate = equipmentstate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

//    public Integer getAreaAreaid() {
//        return areaAreaid;
//    }
//
//    public void setAreaAreaid(Integer areaAreaid) {
//        this.areaAreaid = areaAreaid;
//    }
}