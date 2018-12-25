package com.byavs.entity;

public class Permission {
    private Integer perId;

    private Integer parentPerId;

    private String perName;

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public Integer getParentPerId() {
        return parentPerId;
    }

    public void setParentPerId(Integer parentPerId) {
        this.parentPerId = parentPerId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }
}