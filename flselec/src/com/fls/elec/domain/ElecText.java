/**  
 * @Title: ElecText.java
 * @Package com.fls.elec.daomain
 * @Description: TODO
 * @author honghai xia
 * @date 2017年5月16日
 *
 */
package com.fls.elec.domain;

import java.util.Date;

/**
 * ClassName: ElecText 
 * @Description: TODO
 * @author honghai xia
 * @date 2017年5月16日
 *
 */
@SuppressWarnings("serial")
public class ElecText implements java.io.Serializable {
/*	#测试表
	CREATE TABLE Elec_Text(
		textID varchar(50) not null,
		textName varchar(50),
		textDate datetime,
		textRemark varchar(500)
	)
*/
	
	private String textID;
	private String textName;
	private Date textDate;
	private String textRemark;
	
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
	public Date getTextDate() {
		return textDate;
	}
	/**
	 * @param textDate the textDate to set
	 */
	public void setTextDate(Date textDate) {
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
