/**
 * FileName:         ServiceProvider.java
 * @Description:     TODO
 * @author:          honghai xia
 * @version          V1.0
 * Createdate:       2017年5月16日     下午5:56:00
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
package com.fls.elec.containner;

/**
 * @ClassName:       ServiceProvider
 * @Description:     TODO
 * @author:          honghai xia
 * @date:            2017年5月16日        下午5:56:00
 *
 */
@SuppressWarnings("static-access")
public class ServiceProvider {
	public static ServiceProviderCord spc;
	static{
		spc =new ServiceProviderCord();
		spc.load("beans.xml");
	}
	
	/**
	 * @Title:           getService
	 * @Description:     TODO
	 * @author           honghai xia
	 * @date 			 2017年5月16日
	 * @param:           @return   
	 * @return:          IElecTextService   
	 * @throws
	 *
	 */
	public static Object getService(String serviceName) {
		if (org.apache.commons.lang.StringUtils.isBlank(serviceName)){
			throw new RuntimeException("当前服务名称不支持");
		}
		Object object=null;
		if (spc.ac.containsBean(serviceName)) {
			 object = spc.ac.getBean(serviceName);
		}
		if (object==null) {
			throw new RuntimeException("当前服务名称｛"+serviceName+"｝");
		}
		return object;
	}
	
}
