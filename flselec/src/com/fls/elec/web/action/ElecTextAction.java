/**
 * FileName:         ElecTextAction.java
 * @Description:     TODO
 * @author:          honghai xia
 * @version          V1.0
 * Createdate:       2017年5月16日     下午5:26:29
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



import com.fls.elec.containner.ServiceProvider;
import com.fls.elec.domain.ElecText;
import com.fls.elec.service.IElecTextService;
import com.fls.elec.util.StringHelper;
import com.fls.elec.web.form.ElecTextForm;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @ClassName:       ElecTextAction
 * @Description:     TODO
 * @author:          honghai xia
 * @date:            2017年5月16日        下午5:26:29
 *
 */
@SuppressWarnings("serial")
public class ElecTextAction extends BaseAction implements ModelDriven<ElecTextForm> {

	@SuppressWarnings("unused")
	private IElecTextService elecTextService = (IElecTextService) ServiceProvider.getService(IElecTextService.SERVICE_NAME);
	private ElecTextForm elecTextForm = new ElecTextForm();
	/**
	 * <p>Title: getModel</p>
	 * <p>Description: </p>
	 * @return
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */ 
	@Override
	public ElecTextForm getModel() {
		return elecTextForm ;
	}
	public String  save() {
		ElecText elecText = new ElecText();
		
		elecText.setTextID(elecTextForm.getTextID());
		elecText.setTextName(elecTextForm.getTextName());
		elecText.setTextDate(StringHelper.stringConverDate(elecTextForm.getTextDate()));
		elecText.setTextRemark(elecTextForm.getTextRemark());
		return "save";
	}

}
