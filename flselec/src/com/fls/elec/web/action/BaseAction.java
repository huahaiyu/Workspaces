/**
 * FileName:         BaseAction.java
 * @Description:     TODO
 * @author:          honghai xia
 * @version          V1.0
 * Createdate:       2017年5月16日     下午5:35:16
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
package com.fls.elec.web.action;

import static org.hamcrest.CoreMatchers.nullValue;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName:       BaseAction
 * @Description:     创建baseAction获取required ,response，action
 * @author:          honghai xia
 * @date:            2017年5月16日        下午5:35:16
 *
 */
@SuppressWarnings("serial")
public class BaseAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{
	
	protected  HttpServletRequest request=null;
	protected HttpServletResponse response=null;
	/**
	 * 
	 * <p>Title: setServletResponse</p>
	 * <p>Description: </p>
	 * @param arg0
	 * @see org.apache.struts2.interceptor.ServletResponseAware#setServletResponse(javax.servlet.http.HttpServletResponse)
	 */ 
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * <p>Title: setServletRequest</p>
	 * <p>Description: </p>
	 * @param arg0
	 * @see org.apache.struts2.interceptor.ServletRequestAware#setServletRequest(javax.servlet.http.HttpServletRequest)
	 */ 
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}

}
