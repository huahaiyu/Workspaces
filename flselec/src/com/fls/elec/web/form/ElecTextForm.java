/**
 * FileName:         ElecTextform.java
 * @Description:     TODO
 * @author:          honghai xia
 * @version          V1.0
 * Createdate:       2017年5月16日     下午5:29:30
 * Copyright:        Copyright(C) 2016-2017
 * Company           CY.
 * All rights Reserved, Designed By crane-yuan

 * Modification  History:
 * Date         Author        Version        Discription
 * ---------------------------------------------------------------------------
 * 2017年5月16日     honghai xia       1.0             1.0

 * Why & What is modified:
 *
 */
package com.fls.elec.web.form;

import java.io.Serializable;
import java.sql.Date;

/**
 * @ClassName:       ElecTextform
 * @Description:     VO对象创建
 * @author:          honghai xia
 * @date:            2017年5月16日        下午5:29:30
 *
 */
@SuppressWarnings("serial")
public class ElecTextForm implements Serializable{
	/*
	 * private String textID;
	private String textName;
	private Date textDate;
	private String textRemark;*/
	
	private String textID;
	private String  textName;
	private String  textDate;
	private String  textRemark;
	/**
	 * @return the textID
	 */
	public String getTextID() {
		return textID;
	}
	/**
	 * @param textID the textID to set
	 */
	public void setTextID(String textID) {
		this.textID = textID;
	}
	/**
	 * @return the textName
	 */
	public String getTextName() {
		return textName;
	}
	/**
	 * @param textName the textName to set
	 */
	public void setTextName(String textName) {
		this.textName = textName;
	}
	/**
	 * @return the textDate
	 */
	public String getTextDate() {
		return textDate;
	}
	/**
	 * @param textDate the textDate to set
	 */
	public void setTextDate(String textDate) {
		this.textDate = textDate;
	}
	/**
	 * @return the textRemark
	 */
	public String getTextRemark() {
		return textRemark;
	}
	/**
	 * @param textRemark the textRemark to set
	 */
	public void setTextRemark(String textRemark) {
		this.textRemark = textRemark;
	}
	
	
}
