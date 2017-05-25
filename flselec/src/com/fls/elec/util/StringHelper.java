/**
 * FileName:         StringHelper.java
 * @Description:     TODO
 * @author:          honghai xia
 * @version          V1.0
 * Createdate:       2017年5月16日     下午8:18:12
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
package com.fls.elec.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName:       StringHelper
 * @Description:     string类型转换为date
 * @author:          honghai xia
 * @date:            2017年5月16日        下午8:18:12
 *假的啊
 */
public class StringHelper {
	
	public static Date stringConverDate(String date) {
		SimpleDateFormat fromat = new SimpleDateFormat("yyyy-MM-dd");
		Date d=null;
		try {
			
			 d=fromat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	
	
}
