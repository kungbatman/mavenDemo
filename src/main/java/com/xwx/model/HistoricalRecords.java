package com.xwx.model;

import java.util.Date;

public class HistoricalRecords {
	private Integer recordid;

//    private Integer equipmentinformationEquipmentid;
	
    private Integer meternumber;
    
//    private Integer areaAreaid;
    
    private Integer areanumber;

    private String instantaneousflow;

    private String cumulativeflow;

    private String positivecumulativeflow;

    private String watersupplytemperature;

    private String state;

    private Date time;

    
//    地址
    private Area area;
    
//    设备
    private EquipmentInformation equipmentInformation;
    
    
    
    /*
     *引入设备 
     */
    public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public EquipmentInformation getEquipmentInformation() {
		return equipmentInformation;
	}

	public void setEquipmentInformation(EquipmentInformation equipmentInformation) {
		this.equipmentInformation = equipmentInformation;
	}

	
	
	
	
	
	public Integer getMeternumber() {
        return meternumber;
    }

    public void setMeternumber(Integer meternumber) {
        this.meternumber = meternumber;
    }

    public Integer getAreanumber() {
        return areanumber;
    }

    public void setAreanumber(Integer areanumber) {
        this.areanumber = areanumber;
    }

    public String getInstantaneousflow() {
        return instantaneousflow;
    }

    public void setInstantaneousflow(String instantaneousflow) {
        this.instantaneousflow = instantaneousflow == null ? null : instantaneousflow.trim();
    }

    public String getCumulativeflow() {
        return cumulativeflow;
    }

    public void setCumulativeflow(String cumulativeflow) {
        this.cumulativeflow = cumulativeflow == null ? null : cumulativeflow.trim();
    }

    public String getPositivecumulativeflow() {
        return positivecumulativeflow;
    }

    public void setPositivecumulativeflow(String positivecumulativeflow) {
        this.positivecumulativeflow = positivecumulativeflow == null ? null : positivecumulativeflow.trim();
    }

    public String getWatersupplytemperature() {
        return watersupplytemperature;
    }

    public void setWatersupplytemperature(String watersupplytemperature) {
        this.watersupplytemperature = watersupplytemperature == null ? null : watersupplytemperature.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}