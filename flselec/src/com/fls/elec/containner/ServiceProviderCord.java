/**
 * FileName:         ServiceProviderCord.java
 * @Description:     TODO
 * @author:          honghai xia
 * @version          V1.0
 * Createdate:       2017年5月16日     下午5:59:05
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

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName:       ServiceProviderCord
 * @Description:     TODO
 * @author:          honghai xia
 * @date:            2017年5月16日        下午5:59:05
 *
 */
public class ServiceProviderCord {
	public static ApplicationContext ac;
	public static void load(String filename) {
		ac= new ClassPathXmlApplicationContext(filename);
	}
}
