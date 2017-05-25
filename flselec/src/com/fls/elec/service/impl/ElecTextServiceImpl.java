/**
 * FileName:         ElecTextServiceImpl.java
 * @Description:     TODO
 * @author:          honghai xia
 * @version          V1.0
 * Createdate:       2017年5月16日     下午4:51:52
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
package com.fls.elec.service.impl;

import java.util.jar.Attributes.Name;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fls.elec.dao.IElecTextDao;
import com.fls.elec.domain.ElecText;
import com.fls.elec.service.IElecTextService;

/**
 * @ClassName:       ElecTextServiceImpl
 * @Description:     TODO
 * @author:          honghai xia
 * @date:            2017年5月16日        下午4:51:52
 *
 */
@Transactional(readOnly=true)
@Service(IElecTextService.SERVICE_NAME)
public class ElecTextServiceImpl implements IElecTextService {
	
	@Resource(name=IElecTextService.SERVICE_NAME)	
	private IElecTextDao elecTextDao;

	/**
	 * <p>Title: saveElecText</p>
	 * <p>Description: </p>
	 * @param elecText
	 * @see com.fls.elec.service.IElecTextService#saveElecText(com.fls.elec.domain.ElecText)
	 */ 
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	@Override
	public void saveElecText(ElecText elecText) {
		elecTextDao.save(elecText);
	}
}
