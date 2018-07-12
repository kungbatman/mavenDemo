package com.xwx.model;

public class Area {
    private Integer areaid;

    private String addressnumber;

    private String areaname;

    private String arealevel;

    private String higherareanumber;

    private String higherareaname;

    private String validtags;

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAddressnumber() {
        return addressnumber;
    }

    public void setAddressnumber(String addressnumber) {
        this.addressnumber = addressnumber == null ? null : addressnumber.trim();
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public String getArealevel() {
        return arealevel;
    }

    public void setArealevel(String arealevel) {
        this.arealevel = arealevel == null ? null : arealevel.trim();
    }

    public String getHigherareanumber() {
        return higherareanumber;
    }

    public void setHigherareanumber(String higherareanumber) {
        this.higherareanumber = higherareanumber == null ? null : higherareanumber.trim();
    }

    public String getHigherareaname() {
        return higherareaname;
    }

    public void setHigherareaname(String higherareaname) {
        this.higherareaname = higherareaname == null ? null : higherareaname.trim();
    }

    public String getValidtags() {
        return validtags;
    }

    public void setValidtags(String validtags) {
        this.validtags = validtags == null ? null : validtags.trim();
    }
}