/**
 * FileName:         TestHibernate.java
 * @Description:     TODO
 * @author:          honghai xia
 * @version          V1.0
 * Createdate:       2017年5月24日     下午4:46:12
 * Copyright:        Copyright(C) 2016-2017
 * Company           CY.
 * All rights Reserved, Designed By crane-yuan

 * Modification  History:
 * Date         Author        Version        Discription
 * ---------------------------------------------------------------------------
 * 2017年5月24日     honghai xia       1.0             1.0

 * Why & What is modified:
 *
 */
package junit;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.junit.Test;

import com.fls.elec.domain.ElecText;

/**
 * @ClassName:       TestHibernate
 * @Description:     测试hibernate
 * @author:          honghai xia
 * @date:            2017年5月24日        下午4:46:12
 *
 */
public class TestHibernate {

	@Test
	public void test() {
		Configuration config = new Configuration();
		config.configure();
		// 创建sessionFactory 对象
		SessionFactory sf = config.buildSessionFactory();
		// 打开session，操作数据库
		Session session = sf.openSession();
		// 开启事务
		Transaction tr = session.beginTransaction();

		// 实例化ElecText对象，添加数据，执行保存操作

		ElecText elecText = new ElecText();
		elecText.setTextName("测试hibernate");
		elecText.setTextDate(new Date());
		elecText.setTextRemark("测试hibernate的备注");

		// 保存
		session.save(elecText);
		// 提交事务
		tr.commit();
		session.close();
	}

}
