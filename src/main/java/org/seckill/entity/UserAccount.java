package org.seckill.entity;

import java.io.Serializable;

//@Entity
//@Table(name = "TB_MO_User_Account")
public class UserAccount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5836984837883795878L;
	private Long sellID;// SellID
	private String mobile;// Mobile
	private String password;// Password
	private Integer status;// Status
	private java.sql.Timestamp createTime;// CreateTime
	private java.sql.Timestamp updateTime;// UpdateTime

	public Long getSellID() {
		return sellID;
	}

	public void setSellID(Long sellID) {
		this.sellID = sellID;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}

	public java.sql.Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.sql.Timestamp updateTime) {
		this.updateTime = updateTime;
	}
}
