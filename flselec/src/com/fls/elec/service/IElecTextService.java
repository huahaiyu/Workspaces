/**
 * FileName:         IElecTextService.java
 * @Description:     TODO
 * @author:          honghai xia
 * @version          V1.0
 * Createdate:       2017年5月16日     下午4:49:37
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
package com.fls.elec.service;

import com.fls.elec.domain.ElecText;

/**
 * @ClassName:       IElecTextService
 * @Description:     TODO
 * @author:          honghai xia
 * @date:            2017年5月16日        下午4:49:37
 *
 */
public interface IElecTextService {

	public final static String SERVICE_NAME = "com.fls.elec.service.impl.ElecTextServiceImpl";
	 public void  saveElecText(ElecText elecText) ;
		
}
