package com.hib.jsp.beans;

import java.io.Serializable;

public class Visitor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int visitorId;

	private String visitorName;
	
	private String visitorMailId;
	
	private Long visitorMobileNo;
	
	private String country;

	public int getVisitorId() {
		return visitorId;
	}
	
	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}
	
	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVisitorMailId() {
		return visitorMailId;
	}

	public void setVisitorMailId(String visitorMailId) {
		this.visitorMailId = visitorMailId;
	}

	public Long getVisitorMobileNo() {
		return visitorMobileNo;
	}

	public void setVisitorMobileNo(Long visitorMobileNo) {
		this.visitorMobileNo = visitorMobileNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Visitor [visitorId=" + visitorId + ", visitorName=" + visitorName + ", visitorMailId=" + visitorMailId
				+ ", visitorMobileNo=" + visitorMobileNo + ", country=" + country + "]";
	}
	
}
